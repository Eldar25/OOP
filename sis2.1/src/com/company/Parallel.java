package com.company;

public class Parallel extends Circuit {
    private Circuit a, b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return (a.getResistance() * b.getResistance()) / (a.getResistance() + b.getResistance());
    }

    @Override
    public double getPotentialDif() {
        if (a.getPotentialDif() != b.getPotentialDif())
            throw new RuntimeException();

        return a.getPotentialDif();
    }

    @Override
    public void applyPotentialDif(double potentialDif) {
        this.a.applyPotentialDif(potentialDif);
        this.b.applyPotentialDif(potentialDif);
    }
}

