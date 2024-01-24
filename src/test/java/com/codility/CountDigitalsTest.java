package com.codility;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.codility.count_digitals.Solution01;

public class CountDigitalsTest
{
    private int[][] testcaseAry = {
        { 1, 2 }, { 2, 2 }, { 3, 2 },
        { 4, 2 }, { 5, 3 }, { 6, 3 }
    };

    @Test
    public void testCountDigital()
    {
        Solution01 sol = new Solution01();

        for (int[] testcase : testcaseAry)
        {
            int n = testcase[0];
            int actual = testcase[1];
            int result = sol.solution(n);
            assertEquals(actual, result);
        }
    }
}