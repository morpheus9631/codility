package com.example.city_connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Solution01 sol = new Solution01();
		TestCase tc = new TestCase();
		
		String format1 = "\r\nInput: %s";
		String format2 = "Output: %s";
		for (TestVal val : tc.get())
		{
			int[] T = val.nums;
			String str = Arrays.toString(T);
			System.out.println(String.format(format1, str));

			int[] res = sol.solution(T);
			str = Arrays.toString(res);
			System.out.println(String.format(format2, str));
		}
	}
}

class TestVal
{
	int[] nums;
	public TestVal(int[] nums) { this.nums = nums; }
}

class TestCase
{
	public List<TestVal> get()
	{
		ArrayList<TestVal> list = new ArrayList<TestVal>();
		list.add(new TestVal(new int[] {9,1,4,9,0,4,8,9,0,1}));
		return list;
	}
}
