package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTests {
    @Test
    public void zero_plus_zero_equals_zero() throws Exception {
        checkTwoIntegerFractions(0,0,0);
    }

    @Test
    public void non_zero_plus_zero_equals_non_zero() throws Exception {
        checkTwoIntegerFractions(1,0,1);
        checkTwoIntegerFractions(5,5,0);
    }

    @Test
    public void non_zero_plus_non_zero() throws Exception {
        checkTwoIntegerFractions(4, 1, 3);
    }

    private void checkTwoIntegerFractions(int expected, int first, int second) {
        assertEquals(new Fraction(expected), new Fraction(first).add(new Fraction(second)));
    }

    @Test
    public void negative_numbers() throws Exception {
        checkTwoIntegerFractions(-1,-1,0);
        checkTwoIntegerFractions(2,3,-1);
    }

    @Test
    public void one_plus_one_with_fractions() throws Exception {
        assertEquals(new Fraction(2,1), new Fraction(1,1).add(new Fraction(1,1)));
    }

    @Test
    public void same_denominator_different_numerators() throws Exception {
        assertEquals(new Fraction(4,1), new Fraction(1, 1).add(new Fraction(3, 1)));
    }

    @Test
    public void same_denominator_negative_and_positive_numerator() throws Exception {
        assertEquals(new Fraction(-4,1), new Fraction(-1, 1).add(new Fraction(-3, 1)));
        assertEquals(new Fraction(2,1), new Fraction(-1,1).add(new Fraction(3,1)));
    }

    @Test
    public void mixed_implicit_and_explicit_positive_fractions() throws Exception {
        assertEquals(new Fraction(3,2), new Fraction(1,2).add(new Fraction(1)));
    }


}
