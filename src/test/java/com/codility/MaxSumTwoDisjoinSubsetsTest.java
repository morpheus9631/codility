package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.max_sum_two_disjoin_subsets.Solution;
import com.codility.max_sum_two_disjoin_subsets.Testcase;

public class MaxSumTwoDisjoinSubsetsTest 
{
	private Testcase testcase = new Testcase(
		new int[] { 6,1,4,6,3,2,7,4 }, 3, 2
	);

    private int expected = 24;

    @Test
    public void testSolution()
    {
        Solution sol = new Solution();

		int[] nums = testcase.getNums();
		int K = testcase.getK();
		int L = testcase.getL();
		int actual = sol.solution(nums, K, L);
        assertEquals(expected, actual);
    }
    
}
