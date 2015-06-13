package org.jltalens.Math;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class GreaterCommonDivisorTest {

    private int a;
    private int b;
    private int expected;

    public GreaterCommonDivisorTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: gdc({0}, {1}) = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1}
                , {2, 2, 2}
                , {-1, -1, 1}
                , {-1, 1, 1}
                , {1, -1, 1}
                , {2, 3, 1}
                , {4, 7, 1}
                , {-2, -3, 1}
                , {3, 9, 3}
                , {5, 30, 5}
                , {49, 350, 7}
        });
    }


    @Test
    public void gcd_examples() throws Exception {
        assertEquals(expected, NumberTheory.gcd(a, b));

    }

}
