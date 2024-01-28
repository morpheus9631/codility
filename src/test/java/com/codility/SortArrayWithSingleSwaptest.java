package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.sort_array_with_single_swap.Solution;
import com.codility.sort_array_with_single_swap.TestCase;

public class SortArrayWithSingleSwaptest 
{
    private TestCase[] testcaseAry;
    
    @Before
    public void setupTestCase() {
        testcaseAry =  new TestCase[3];
        testcaseAry[0] = new TestCase(new int[] {1,3,5,3,7}, true);
        testcaseAry[1] = new TestCase(new int[] {1,3,5,3,4}, false);
        testcaseAry[2] = new TestCase(new int[] {1,3,5}, true);
    }

    @Test
    public void testSolution()
    {
        Solution sol = new Solution();

        for (TestCase tc : testcaseAry)
        {
            int[] nums = tc.getNums();
            boolean expected = tc.isExpected();
            boolean actual = sol.solution(nums);
            assertEquals(expected, actual);
        }
    }
}
