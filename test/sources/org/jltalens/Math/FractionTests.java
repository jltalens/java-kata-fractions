package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTests {

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


    @Test
    public void different_denominators() throws Exception {
        assertEquals(new Fraction(5,6), new Fraction(1,2).add(new Fraction(1,3)));

    }
}
