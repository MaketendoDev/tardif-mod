package net.maketendo.tardifmod.utils.animation;

class FadeStep {
    final int ticks;
    final float target;

    FadeStep(int ticks, float target) {
        this.ticks = ticks;
        this.target = target;
    }

    public int ticks() {
        return ticks;
    }

    public float target() {
        return target;
    }
}


