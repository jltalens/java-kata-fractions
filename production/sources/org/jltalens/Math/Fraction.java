package org.jltalens.Math;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int intValue) {
        this(intValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that) {
        return new Fraction((this.numerator * that.denominator) + (that.numerator * this.denominator),
                this.denominator * that.denominator);
    }

    public int intValue() {
        return getNumerator();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
