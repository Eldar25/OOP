package com.company;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDif;

    public Resistor(double r) {
        this.resistance = r;
    }

    public double getResistance() {
        return resistance;
    }

    public double getPotentialDif() {
        return potentialDif;
    }

    public void applyPotentialDif(double potentialDif) {
        this.potentialDif = potentialDif;
    }

}
