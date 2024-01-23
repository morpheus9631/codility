package main.Maximize_Distance_Two_Points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main001
{
	public static void main(String[] args)
	{
		Solution001 sol = new Solution001();
		TestCase001 tc = new TestCase001();
		
		String format1 = "\r\nInput: %s";
		String format2 = "Output: %d";
		
		for (TestVal001 val : tc.get())
		{
			int[] nums = val.nums;
			String str = Arrays.toString(nums);
			System.out.println(String.format(format1, str));

			int A = nums[0], B = nums[1], C = nums[2], D = nums[3];
			int res = sol.solution(A, B, C, D);
			System.out.println(String.format(format2, res));
		}
	}

}

class TestVal001
{
	int[] nums;
	public TestVal001(int[] nums) { this.nums = nums; }
}

class TestCase001
{
	public List<TestVal001> get()
	{
	  ArrayList<TestVal001> list = new ArrayList<TestVal001>();

	  list.add(new TestVal001(new int[] {1,1,2,3})); // 5
	  list.add(new TestVal001(new int[] {2,4,2,4})); // 
	  
	  return list;
	}
	
}
