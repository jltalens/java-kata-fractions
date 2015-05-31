package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTests {
    @Test
    public void zero_plus_zero_equals_zero() throws Exception {
        Fraction first = new Fraction(0);
        Fraction second = new Fraction(0);
        Fraction sum = first.add(second);
        assertEquals(0, sum.intValue());
    }
}
