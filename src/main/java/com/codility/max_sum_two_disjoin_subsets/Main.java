package com.codility.max_sum_two_disjoin_subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		Solution sol = new Solution();

		Testcase testcase = new Testcase(
			new int[] { 6, 1, 4, 6, 3, 2, 7, 4 }, 
			3, 
			2
		);
		
		String format1 = "\r\nInput: %s, K = %d, L = %d";
		String format2 = "Output: %d";
		
		int[] nums = testcase.getNums();
		int K = testcase.getK();
		int L = testcase.getL();
		String str = Arrays.toString(nums);
		System.out.println(String.format(format1, str, K, L));

		int res = sol.solution(nums, K, L);
		System.out.println(String.format(format2, res));
	}
}
