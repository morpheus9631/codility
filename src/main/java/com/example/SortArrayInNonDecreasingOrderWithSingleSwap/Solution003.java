package main.SortArrayInNonDecreasingOrderWithSingleSwap;

public class Solution003
{
  public boolean solution(int[] A) 
  {
    //Should have an array
    int max = A[0];
    int upperBound = 0;

    //Look for the number of element
    for (int i=0; i<A.length; i++)
    {
      if (A[i] > max)
      {
        max = A[i];
        upperBound = i;
      }
    }
    //Conditional operation to check
    for (int j=0; j<upperBound ; j++) {
      if (A[j] > max) return false;
    }

    for (int j=upperBound + 1; j < A.length-1; j++) {
      if (!(max > A[j] && A[j + 1] < A[j])) return false;
    }
    return true;
  }
}
