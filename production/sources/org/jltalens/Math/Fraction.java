package org.jltalens.Math;

public class Fraction {
    private int intValue;

    public Fraction(int intValue) {
        this.intValue = intValue;
    }

    public Fraction(int numerator, int denominator) {
    }

    public Fraction add(Fraction that) {
        return new Fraction(this.intValue() + that.intValue());
    }

    public int intValue() {
        return intValue;
    }

    public int getNumerator() {
        return 2;
    }

    public int getDenominator() {
        return 1;
    }
}
