package com.codility;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.codility.count_digitals.Solution01;

public class CountDigitalsTest
{
    private int[] testcaseAry = {
        1, 2, 3, 4, 5, 6
    };

    private int[] expectedAry = {
        2, 2, 2, 2, 3, 3
    };

    @Test
    public void testCountDigital()
    {
        Solution01 sol = new Solution01();

        for (int i=0; i<testcaseAry.length; i++)
        {
            int testcase = testcaseAry[i];
            int expected = expectedAry[i];
            int actual = sol.solution(testcase);
            assertEquals(expected, actual);
        }
    }
}