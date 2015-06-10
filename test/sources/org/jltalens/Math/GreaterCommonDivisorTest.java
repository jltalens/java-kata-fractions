package org.jltalens.Math;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreaterCommonDivisorTest {
    @Test
    public void one_and_one_should_be_one() throws Exception {
        assertEquals(1, gdc(1,1));

    }

    private int gdc(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
