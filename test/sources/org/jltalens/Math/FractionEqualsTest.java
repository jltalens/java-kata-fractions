package org.jltalens.Math;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {
    @Test
    public void same_numerator_and_denominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));

    }

    @Test
    public void different_numerators() throws Exception {
        assertNotEquals(new Fraction(1,3), new Fraction(4,5));

    }

    @Test
    public void different_denominators() throws Exception {
        assertNotEquals(new Fraction(1,4), new Fraction(1,3));

    }

    @Test
    public void whole_numbers_same_fractions() throws Exception {
        assertEquals(new Fraction(4), new Fraction(4,1));

    }

    @Test
    public void whole_numbers_not_equals_each_other() throws Exception {
        assertNotEquals(new Fraction(3), new Fraction(2));

    }
}
