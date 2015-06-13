package org.jltalens.Math;

import static org.jltalens.Math.NumberTheory.gcd;

public class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int intValue) {
        this(intValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        // gcd never returns 0
        int gdc = gcd(numerator, denominator) * signOfDenominator;
        this.numerator = numerator / gdc;
        this.denominator = denominator / gdc;
    }

    public Fraction add(Fraction that) {
        return new Fraction((this.numerator * that.denominator) + (that.numerator * this.denominator),
                this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Fraction fraction = (Fraction) other;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;

    }

    @Override
    public int hashCode() {
        return 31 * numerator + denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

}
