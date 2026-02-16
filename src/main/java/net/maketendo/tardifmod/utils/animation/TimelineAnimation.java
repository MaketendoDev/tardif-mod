package net.maketendo.tardifmod.utils.animation;

public interface TimelineAnimation {
    void tick();
    boolean isFinished();
    void onFinish();
}

