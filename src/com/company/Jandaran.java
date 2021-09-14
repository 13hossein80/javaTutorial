package com.company;

public abstract class Jandaran implements Mojodat {

    private boolean isAlive = true;
    public JandaranState state;

    protected boolean isAlive() {
        return isAlive;
    }
}
