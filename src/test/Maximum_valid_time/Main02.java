package test.Maximum_valid_time;

public class Main02
{
  public static void main(String[] args)
  {
    int[][] testcase = 
    { 
      {1,8,3,2},     // Expected: 23:18
      {2,4,0,0},     // Expected: 20:40
      {3,0,7,0},     // Expected: 07:30
      {9,1,9,7}      // Expected: NOT POSSIBLE
    };

    Solution02v2 sol = new Solution02v2();

    for (int[] nums : testcase)
    {
      int A = nums[0];
      int B = nums[1];
      int C = nums[2];
      int D = nums[3];

      String format = "A: %d, B: %d, C: %d, D: %d";
      System.out.println(String.format(format, A, B, C, D));

      String str = sol.solution(A, B, C, D);
      System.out.println("Results: "+str);
      System.out.println();
    }
  }
}
