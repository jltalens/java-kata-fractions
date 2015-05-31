package org.jltalens.Math;

public class Fraction {
    private int intValue;

    public Fraction(int intValue) {
        this.intValue = intValue;
    }

    public Fraction add(Fraction that) {
        if (that.intValue == 0) {
            return new Fraction(this.intValue());
        }
        else {
            return new Fraction(that.intValue());
        }
    }

    public int intValue() {
        return intValue;
    }
}
