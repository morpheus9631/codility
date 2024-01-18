package test.Decimal_ZIP_problem;

public class Main01
{
  public static void main(String[] args)
  {
    int[][] testcase = 
    { 
        {12,56},         // Expected: 1526
        {56,12},         // Expected: 5162
        {12345,678},     // Expected: 16273845
        {123,67890},     // Expected: 16273890
        {1234,0},        // Expected: 10234
        {12345,678},     // Expected: 16273845
        {12345,67890},   // Expected: -1
        {1234567890,1},  // Expected: -1
        {123456,123456}  // Expected: -1
    };
    
    for (int[] nums : testcase)
    {
      int A = nums[0];
      int B = nums[1];
      System.out.println("A: "+A+", B: "+B);
      
      Solution01 sol = new Solution01();
      int res = sol.solution(A, B);
      System.out.println("Ans: "+res);
      System.out.println("\r\n----------------------------------------\r\n");
    }
  }
}
