package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.count_digitals.Solution;
import com.codility.count_digitals.TestCase;

public class CountDigitalsTest
{
    private TestCase[] testcaseAry;
    
    @Before
    public void setupTestCase()
    {
        testcaseAry = new TestCase[4];
        testcaseAry[0] = new TestCase(1, 2);
        testcaseAry[1] = new TestCase(2, 2);
        testcaseAry[2] = new TestCase(5, 3);
        testcaseAry[3] = new TestCase(6, 3);
    }

    @Test
    public void testCountDigital()
    {
        Solution sol = new Solution();

        for (TestCase tc: testcaseAry)
        {
            int N = tc.getN();
            int expected = tc.getExpected();
            int actual = sol.solution(N);
            assertEquals(expected, actual);
        }
    }
}