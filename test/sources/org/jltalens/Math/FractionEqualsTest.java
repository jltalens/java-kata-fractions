package org.jltalens.Math;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionEqualsTest {
    @Test
    public void same_numerator_and_denominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));

    }
}
