package com.codility;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.codility.decimal_zip.Solution01;

public class DecimalZipTest
{
    private static int[][] testcaseAry = 
    { 
        { 12, 56 },
        { 56, 12 },
        { 12345, 678 },
        { 123, 67890 },
        { 1234, 0 },
        { 12345, 678 },
        { 12345, 67890 },
        { 1234567890, 1 },
        { 123456, 123456 }
    };

    private int[] expectedAry = {
        1526, 5162, 16273845, 16273890,
        10234, 16273845, -1, -1, 
        -1
    };

    @Test
    public void testZip()
    {
        Solution01 sol = new Solution01();

        for (int i=0; i<testcaseAry.length; i++)
        {
            int A = testcaseAry[i][0];
            int B = testcaseAry[i][1];
            int expected = expectedAry[i];
            int actual = sol.solution(A, B);
            assertEquals(expected, actual);
        }
    }
}