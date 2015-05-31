package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTests {
    @Test
    public void zero_plus_zero_equals_zero() throws Exception {
        assertEquals(0, new Fraction(0).add(new Fraction(0)).intValue());
    }

    @Test
    public void non_zero_plus_zero_equals_non_zero() throws Exception {
        assertEquals(1, new Fraction(0).add(new Fraction(1)).intValue());
        assertEquals(5, new Fraction(5).add(new Fraction(0)).intValue());
    }

    @Test
    public void non_zero_plus_non_zero() throws Exception {
        assertEquals(4, new Fraction(1).add(new Fraction(3)).intValue());
    }

    @Test
    public void negative_numbers() throws Exception {
        assertEquals(-1, new Fraction(-1).add(new Fraction(0)).intValue());
        assertEquals(2, new Fraction(3).add(new Fraction(-1)).intValue());
    }

    @Test
    public void one_plus_one_with_fractions() throws Exception {
        Fraction sum = new Fraction(1, 1).add(new Fraction(1, 1));
        assertEquals(2, sum.getNumerator());
        assertEquals(1, sum.getDenominator());
    }

    @Test
    public void same_denominator_different_numerators() throws Exception {
        Fraction sum = new Fraction(1, 1).add(new Fraction(3, 1));
        assertEquals(4, sum.getNumerator());
        assertEquals(1, sum.getDenominator());
    }
}
