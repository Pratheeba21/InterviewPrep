/*###Problem Description
 
Find the contiguous subarray within an array, A of length N which has the largest sum.


Problem Constraints
1 <= N <= 106
-1000 <= A[i] <= 1000


Input Format
The first and the only argument contains an integer array, A.


Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.


Example Input
Input 1:
A = [1, 2, 3, 4, -10]
Input 2:
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output
Output 1:
10
Output 2:
6


Example Explanation
Explanation 1:
The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:
The subarray [4,-1,2,1] has the maximum possible sum of 6.*/



//PROGRAM:
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int N=A.size();
        int maxCurrent=A.get(0);
        int maxGlobal=A.get(0);
        for(int i=1;i<N;i++){
            maxCurrent=Math.max(A.get(i),maxCurrent+A.get(i));
            maxGlobal=Math.max(maxCurrent,maxGlobal);
        }
        return maxGlobal;
    }
}

