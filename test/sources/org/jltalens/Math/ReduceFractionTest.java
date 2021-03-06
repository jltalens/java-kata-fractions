package org.jltalens.Math;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {
    @Test
    public void already_in_lowest_test() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    public void reduce_to_not_whole_number() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));

    }

    @Test
    public void reduce_to_whole_number() throws Exception {
        assertEquals(new Fraction(6), new Fraction(24, 4));

    }

    @Test
    public void reduce_zero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0, 123));

    }
}

