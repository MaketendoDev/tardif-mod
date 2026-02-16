package net.maketendo.tardifmod.client.managers;

import net.maketendo.tardifmod.utils.animation.TimelineAnimation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimationManager {

    private static final List<TimelineAnimation> ACTIVE = new ArrayList<>();

    public static void trigger(TimelineAnimation animation) {
        ACTIVE.add(animation);
    }

    public static void tick() {
        Iterator<TimelineAnimation> it = ACTIVE.iterator();

        while (it.hasNext()) {
            TimelineAnimation anim = it.next();
            anim.tick();

            if (anim.isFinished()) {
                anim.onFinish();
                it.remove();
            }
        }
    }
}



