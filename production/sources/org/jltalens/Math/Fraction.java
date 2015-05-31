package org.jltalens.Math;

public class Fraction {
    private int intValue;

    public Fraction(int intValue) {
        this.intValue = intValue;
    }

    public Fraction add(Fraction that) {
        return new Fraction(that.intValue());
    }

    public int intValue() {
        return intValue;
    }
}
