package com.codility;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.codility.winter_an_summer.Solution;
import com.codility.winter_an_summer.TestCase;

public class WinterAndSummerTest 
{
    private TestCase[] testcaseAry;

    @Before
    public void setupTestCase()
    {
        testcaseAry = new TestCase[2];
        testcaseAry[0] = new TestCase(new int[] { 5, -2, 3, 8, 6 }, 3);
        testcaseAry[1] = new TestCase(new int[] { -5, -5, -5, -42, 6, 12 }, 4);
    }

    @Test
    public void testSolution()
    {
        Solution sol = new Solution();

        for (TestCase tc : testcaseAry)
        {
            int[] nums = tc.getNums();
            int expected = tc.getExpected();
            int actual = sol.solution(nums);
            assertEquals(expected, actual);
        }
    }

    
}
