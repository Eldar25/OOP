package com.company;

public abstract class Circuit {
    abstract double getResistance();

    abstract double getPotentialDif();

    abstract void applyPotentialDif(double V);

    public double getPower() {
        return Math.pow(getPotentialDif(), 2) / getResistance();
    }

    public double getCurrent() {
        return getPotentialDif() / getResistance();
    }
}