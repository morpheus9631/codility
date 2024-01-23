package com.codility.decimal_zip;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecimalZipTest
{
    private static int[][] testcaseAry = 
    { 
        { 12, 56, 1526 },
        { 56, 12, 5162 },
        { 12345, 678, 16273845 },
        { 123, 67890, 16273890},
        { 1234, 0, 10234 },
        { 12345, 678, 16273845 },
        { 12345, 67890, -1 },
        { 1234567890, 1, -1 },
        { 123456, 123456, -1 }
    };

    @Test
    public void testZip()
    {
        Solution01 sol = new Solution01();

        for (int[] testcase : testcaseAry)
        {
            int A = testcase[0];
            int B = testcase[1];
            int actual = testcase[2];
            int result = sol.solution(A, B);
            assertEquals(actual, result);
        }
    }
}