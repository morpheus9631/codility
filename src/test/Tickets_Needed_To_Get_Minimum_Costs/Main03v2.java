package test.Tickets_Needed_To_Get_Minimum_Costs;

import java.util.Arrays;

public class Main03v2
{
  public static void main(String[] args)
  { 
    int[][] testcase = 
    { 
      {1,30},                             // Expected: 4 
      {1,2,4,5,7,29,30},                  // Expected: 11
      {1,2,7,8,9,10,11,20,30},            // Expected: 15
      {1,2,3,4,5,15,16,25,26,27,30},      // Expected: 18
      {1,2,3,4,5,6,7,8,9,10,11,12},       // Expected: 14
      {1,2,3,4,5,6,7,8,9,10,21,22,30},    // Expected: 19
      {1,2,3,4,5,6,7,21,22,30},           // Expected: 13
      {1,3,5,7,9,11,13,15,17,19,21,23,25} // Expected: 25
    };

    for (int[] A : testcase)
    {
      System.out.println("Array: "+Arrays.toString(A));
      
      Solution03v4 sol = new Solution03v4();
      int cost = sol.solution(A);
      System.out.println("Results: "+cost);
      System.out.println("\r\n-------------------------------------------\r\n");
    }
  }
}
