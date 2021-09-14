package com.company;

public abstract class Animals extends Jandaran {
    @Override
    public int numberOfGroup() {
        return 5;
    }

    public Animals() {
        state = JandaranState.HEALTHY;
    }
}
