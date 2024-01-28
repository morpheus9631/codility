package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.smallest_not_exist_positive_int.Solution;
import com.codility.smallest_not_exist_positive_int.TestCase;

public class SmallestNotExistPositiveIntTest 
{
    private TestCase[]  testcaseAry;
    
    @Before
    public void setupTestCaseAry() 
    {
        testcaseAry = new TestCase[3];
        testcaseAry[0] = new TestCase(new int[] {1,3,6,4,1,2}, 5);
        testcaseAry[1] = new TestCase(new int[] {1,2,3}, 4);
        testcaseAry[2] = new TestCase(new int[] {-1,-3}, 1);
    }

    @Test
    public void testSoultion()
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
