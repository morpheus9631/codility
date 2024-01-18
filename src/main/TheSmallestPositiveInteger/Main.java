package main.TheSmallestPositiveInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Solution000 sol = new Solution000();
		TestCase000 tc = new TestCase000();
		
		String format1 = "\r\nInput: %s";
		String format2 = "Output: %d";
		
		for (TestVal000 val : tc.get())
		{
			int[] nums = val.nums;
			String str = Arrays.toString(nums);
			System.out.println(String.format(format1, str));

			int res = sol.solution(nums);
			System.out.println(String.format(format2, res));
		}
	}
}


class TestVal000
{
	int[] nums;
	public TestVal000(int[] nums) { this.nums = nums; }
}

class TestCase000
{
	public List<TestVal000> get()
	{
	  ArrayList<TestVal000> list = new ArrayList<TestVal000>();

	  list.add(new TestVal000(new int[] {1,3,6,4,1,2}));
	  list.add(new TestVal000(new int[] {1,2,3}));
	  list.add(new TestVal000(new int[] {-1,-3}));
	  
	  return list;
	}
	
}
