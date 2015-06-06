package org.jltalens.Math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class FractionIntegerTests {

    private int expected;
    private int first;
    private int second;

    public FractionIntegerTests(int expected, int first, int second) {
        this.expected = expected;
        this.first = first;
        this.second = second;
    }

    @Parameterized.Parameters(name = "{index}: add({1} + {2} = {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, 0, 0},
                {1, 0, 1},
                {5, 5, 0},
                {4, 1, 3},
                {-1, -1, 0},
                {2, 3, -1}
        });
    }

    @Test
    public void checkTwoIntegerFractions() {
        assertEquals(new Fraction(expected), new Fraction(first).add(new Fraction(second)));
    }
}
