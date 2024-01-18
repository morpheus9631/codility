package main.TheSmallestPositiveInteger;

public class Solution000
{
  public int solution(int[] A) 
  {
  	if (A == null) return 1;
  	if (A.length == 0) return 1;
  	
  	int len = A.length;
  	for (int i=0; i<len-1; i++) {
  		for (int j=i+1; j<len; j++) {
  			if (A[i] > A[j]) {
  				int tmp = A[i]; A[i] = A[j]; A[j] = tmp;
  			}
  		}
  	}
  	
  	int target = 1;
  	while (true)
  	{
    	int left = 0, right = len;
    	boolean isFind = false;
  		while (!isFind && left < right)
  		{
    		int mid = left + (right - left) / 2;
//    		System.out.println("B:"+left+", "+mid+", "+right+", "+target);

    		if (target > A[mid])
  				left = mid + 1;
   			else if (target < A[mid])
  				right = mid;
   			else if (target == A[mid]) {
   				isFind = true;
   			}
    		
//    		System.out.println("A:"+left+", "+right+", "+isFind);
  		}
  		if (!isFind) break;
  	  target++;
 		}

  	return target;
  }
}
