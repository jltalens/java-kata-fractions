package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTests {
    @Test
    public void zero_plus_zero_equals_zero() throws Exception {
        assertEquals(0, new Fraction(0).add(new Fraction(0)).intValue());
    }
}
