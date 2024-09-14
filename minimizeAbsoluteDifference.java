/*Problem Description
Given three sorted arrays A, B  and Cof not necessarily same sizes.

Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively.

i.e. minimize | max(a,b,c) - min(a,b,c) |.

Example :

Input:

A : [ 1, 4, 5, 8, 10 ]
B : [ 6, 9, 15 ]
C : [ 2, 3, 6, 6 ]
Output:

1
Explanation: We get the minimum difference for a=5, b=6, c=6 as | max(a,b,c) - min(a,b,c) | = |6-5| = 1.*/


###PROGRAM:
import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i=0,j=0,k=0;
        int minDiff=Integer.MAX_VALUE;
        
        
        while(i<A.size() && j<B.size() && k<C.size()){
            int a=A.get(i);
            int b=B.get(j);
            int c=C.get(k);
            
            int currentMax= Math.max(a,Math.max(b,c));
            int currentMin= Math.min(a,Math.min(b,c));
            
            int currentDiff=currentMax-currentMin;
            
            minDiff=Math.min(minDiff,currentDiff);
            
            if(minDiff==0){
                break;
            }
            
            if(currentMin==a){
                i++;
            }
            else if(currentMin==b){
                j++;
            }
            else{
                k++;
            }
        }
        return minDiff;
    }
}
