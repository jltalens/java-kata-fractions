package org.jltalens.Math;

public class Fraction {
    private int intValue;
    private int numerator;
    private int denominator;

    public Fraction(int intValue) {
        this.intValue = intValue;
        this.numerator = intValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.intValue = numerator;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that) {
        return new Fraction(this.intValue() + that.intValue());
    }

    public int intValue() {
        return intValue;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
