package org.jltalens.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionIntegerTests {
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

}
