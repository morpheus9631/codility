package com.codility;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.codility.city_connection.Solution;
import com.codility.city_connection.TestCase;


public class CityConnectionTest {

    private TestCase testcase;
    
    @Before
    public void setupTestCase()
    {
        testcase = new TestCase(
            new int[] {9,1,4,9,0,4,8,9,0,1},
            new int[] {1,3,2,3,0,0,0,0,0});
    }
    
    @Test
    public void testSolution()
    {
        Solution sol = new Solution();
        
		int[] nums = testcase.getNums();
        int[] expected = testcase.getExpected();
		int[] actual = sol.solution(nums);
        assertArrayEquals(expected, actual);   
    }
}
