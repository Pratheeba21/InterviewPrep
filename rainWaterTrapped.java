/*Problem Description

Given an integer array A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
The only argument given is integer array A.



Output Format
Return the total water it is able to trap after raining.



Example Input
Input 1:

 A = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Input 2:

 A = [1, 2]


Example Output
Output 1:

 6
Output 2:

 0


Example Explanation

 In this case, 6 units of rain water (blue section) are being trapped.
Explanation 2:

 No water is trapped.*/


///PROGRAM:
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
     if(A==null||A.size()==0) {
         return 0;
     }  
     
     int n=A.size();
     int leftMax[]=new int[n];
     int rightMax[]=new int[n];
     
     leftMax[0]=A.get(0);
     for(int i=1;i<n;i++){
         leftMax[i]=Math.max(leftMax[i-1],A.get(i));
     }
     
     rightMax[n-1]=A.get(n-1);
     for(int i=n-2;i>=0;i--){
         rightMax[i]=Math.max(rightMax[i+1],A.get(i));
     }
     
     int totalWater=0;
     for(int i=0;i<n;i++){
         totalWater+=Math.min(leftMax[i],rightMax[i])-A.get(i);
     }
     
     return totalWater;
    }
}
