package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.decimal_zip.Solution;
import com.codility.decimal_zip.TestCase;

public class DecimalZipTest
{
    private TestCase[] testcaseAry;
    
    @Before
    public void setupTestCase()
    {
        testcaseAry = new TestCase[7];
        testcaseAry[0] = new TestCase(12, 56, 1526);
        testcaseAry[1] = new TestCase(56, 12, 5162);
        testcaseAry[2] = new TestCase(123, 67890, 16273890);
        testcaseAry[3] = new TestCase(1234, 0, 10234);
        testcaseAry[4] = new TestCase(12345, 678, 16273845);
        testcaseAry[4] = new TestCase(12345, 67890, -1);
        testcaseAry[5] = new TestCase(123456, 123456, -1);
        testcaseAry[6] = new TestCase(1234567890, 1, -1);
    }

    @Test
    public void testZip()
    {
        Solution sol = new Solution();

        for (TestCase tc : testcaseAry)
        {
            int A = tc.getA();
            int B = tc.getB();
            int expected = tc.getExpected();
            int actual = sol.solution(A, B);
            assertEquals(expected, actual);
        }
    }
}