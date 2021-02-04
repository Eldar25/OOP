package com.company;

public class Series extends Circuit {
    private Circuit a, b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDif() {
        return a.getPotentialDif() + b.getPotentialDif();
    }

    @Override
    public void applyPotentialDif(double p) {
        double i = p / getResistance();
        a.applyPotentialDif(i * a.getResistance());
        b.applyPotentialDif(i * b.getResistance());
    }

}