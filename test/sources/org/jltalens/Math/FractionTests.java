package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTests {

    @Test
    public void one_plus_one_with_fractions() throws Exception {
        assertEquals(new Fraction(2, 1), new Fraction(1, 1).add(new Fraction(1, 1)));
    }

    @Test
    public void same_denominator_different_numerators() throws Exception {
        assertEquals(new Fraction(4, 1), new Fraction(1, 1).add(new Fraction(3, 1)));
    }

    @Test
    public void same_denominator_negative_and_positive_numerator() throws Exception {
        assertEquals(new Fraction(-4, 1), new Fraction(-1, 1).add(new Fraction(-3, 1)));
        assertEquals(new Fraction(2, 1), new Fraction(-1, 1).add(new Fraction(3, 1)));
    }

    @Test
    public void mixed_implicit_and_explicit_positive_fractions() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(1, 2).add(new Fraction(1)));
    }


    @Test
    public void different_denominators() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).add(new Fraction(1, 3)));

    }

    @Test
    public void same_denominators_reduce() throws Exception {
        assertEquals(new Fraction(1), new Fraction(1, 3).add(new Fraction(2, 3)));
    }

    @Test
    public void a_denominator_is_multiple_of_the_other() throws Exception {
        assertEquals(new Fraction(11, 8), new Fraction(3, 4).add(new Fraction(5, 8)));

    }

    @Test
    public void common_denominators() throws Exception {
        assertEquals(new Fraction(11, 18), new Fraction(1, 6).add(new Fraction(4, 9)));
    }

    @Test
    public void reduce_result_even_when_same_denominators() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(3, 4).add(new Fraction(3, 4)));
    }

    @Test
    public void negative_fractions_and_reduce() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(-1, 4).add(new Fraction(3, 4)));

    }

    @Test
    public void negative_signs_everywhere() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(1, -4).add(new Fraction(-3, -4)));
    }

    @Test
    public void zero_in_denominator() throws Exception {
        assertEquals(new Fraction(1, 0), new Fraction(1, 0).add(new Fraction(-3, -4)));
        assertEquals(new Fraction(5, 0), new Fraction(5, 0).add(new Fraction(1333, 123123)));
    }
}
