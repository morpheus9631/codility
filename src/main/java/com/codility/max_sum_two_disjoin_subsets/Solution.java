package com.codility.max_sum_two_disjoin_subsets;

import java.util.Arrays;

public class Solution
{
	public int solution(int[] A, int K, int L) 
	{
		if (A == null) return -1;
		
		int len = A.length; 
		if (len < (K+L)) return -1;

		int max_sum = 0;
		for (int i=K-1; i<len; i++)
		{
			int[] newA = A.clone();

			int dp_k = 0;
			for (int j=0; j<K; j++) {
				dp_k += A[i-j];
				newA[i-j] = -1;
			}
			
			System.out.println(dp_k);
			System.out.println(Arrays.toString(newA));

			int[] dp_l = new int[len];
			for (int j=L-1; j<len; j++) 
			{
				int sum = 0;
				for (int k=0; k<L; k++) {
					sum += newA[j-k];
				}
				dp_l[j] = ((sum < newA[j]) ? -1 : sum);	
			}

			System.out.println(Arrays.toString(dp_l));
			
			for (int j=0; j<len; j++)
			{
				int max = dp_k + dp_l[j];
				if (max > max_sum) max_sum = max;
			}
		}
		return max_sum;
	}
}
