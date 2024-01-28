package com.codility.city_connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Solution sol = new Solution();
		
		String format = "\r\nInput: %s\r\nOutput: %s";

		TestCase tc = getTestCase();
		
		int[] nums = tc.getNums();
		String inStr = Arrays.toString(nums);

		int[] results = sol.solution(nums);
		String outStr = Arrays.toString(results);
		System.out.println(String.format(format, inStr, outStr));
	}

	public static TestCase getTestCase()
	{
		return new TestCase(new int[] {9,1,4,9,0,4,8,9,0,1},
							new int[] {1,3,2,3,0,0,0,0,0});
	}
}