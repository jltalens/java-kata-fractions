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

    @Parameterized.Parameters(name = "{index}: gcd({0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1}
        });
    }


    @Test
    public void one_and_one_should_be_one() throws Exception {
        assertEquals(expected, gcd(a, b));

    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
