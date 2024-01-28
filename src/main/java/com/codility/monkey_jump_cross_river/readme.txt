
# MonkeyJumpCrossRiver

  A monkey is on one bank (position −1) of a river and wants to get to the opposite bank (position N).
  The monkey can jump any (integer) distance between 1 and D. 
  If D is less than or equal to N then the monkey cannot jump right across the river. 
  Luckily, there are many stones under water. 
  Water is progressively draining away and soon some stones will be out of the water.
  The monkey can jump to and from any stone, but only when the stone is out of the water.
  
  The stones in the river are described in array A consisting of N integers for N stones labeled 0 to N-1. 
  A[K] represents the first time the stone at position K will emerge. (A[K] = −1 means never). 
  You can assume that no two stones will surface simultaneously. 
  The goal is to find the earliest time our monkey can reach other bank.
  
  For example, consider D = 3 and array A consisting of N = 6 integers:
  A[0] = 1
  A[1] = -1
  A[2] = 0
  A[3] = 2
  A[4] = 3
  A[5] = 5
  
  At time 2, there will be three stones out of the water.
  
  Write a function: int solution(int[] A, int D);
   
  that, given an array A consisting of N integers, and integer D, 
  returns the earliest time when the monkey can cross the river.
   
  If the monkey can do so in one jump, just return 0. Return −1 to mean never.
  
  For A = [3, 2, 1] and D = 1, the function should return 3, since the monkey has to wait for each stone.
  
  For A = [1, 2, 3, 4, −1, −1, −1] and D = 3, the function should return −1 meaning never.
  
  Each element of array A is an integer within the range [−1..100,000], where -1 means no-stone.
  
  Complexity:
  expected worst-case time complexity is O(N+max(A));
  expected worst-case space complexity is O(N+max(A)).
  
  
