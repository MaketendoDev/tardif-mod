package net.maketendo.tardifmod.utils.animation;

import it.unimi.dsi.fastutil.floats.FloatConsumer;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.List;

public class FadeTimeline implements TimelineAnimation {

    private final FloatConsumer setter;
    private final List<FadeStep> steps = new ArrayList<>();

    private Runnable onFinish = () -> {};
    private Runnable onTick = () -> {};

    private int stepIndex = 0;
    private int stepTicks = 0;

    private float current;
    private float start;

    public FadeTimeline(float startValue, FloatConsumer setter) {
        this.current = startValue;
        this.start = startValue;
        this.setter = setter;
        setter.accept(startValue);
    }

    public FadeTimeline fadeTo(int ticks, float target) {
        steps.add(new FadeStep(ticks, target));
        return this;
    }

    public FadeTimeline onFinish(Runnable action) {
        this.onFinish = action;
        return this;
    }

    public FadeTimeline onTick(Runnable action) {
        this.onTick = action;
        return this;
    }

    @Override
    public void tick() {
        if (stepIndex >= steps.size()) return;

        FadeStep step = steps.get(stepIndex);
        stepTicks++;

        float progress = stepTicks / (float) step.ticks();
        progress = MathHelper.clamp(progress, 0f, 1f);

        float value = MathHelper.lerp(progress, start, step.target());
        setter.accept(value);
        onTick.run();

        if (stepTicks >= step.ticks()) {
            current = step.target();
            start = current;
            stepTicks = 0;
            stepIndex++;
        }
    }

    @Override
    public boolean isFinished() {
        return stepIndex >= steps.size();
    }

    @Override
    public void onFinish() {
        onFinish.run();
    }
}

