Problem Description
 
 

Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.



Problem Constraints
1 <= |A| <= 106
1 <= Ai <= 109


Input Format
The first argument is an integer array A.


Output Format
Return the majority element.


Example Input
A = [2, 1, 2]


Example Output
2


Example Explanation
2 occurs 2 times which is greater than 3/2.




  PROGRAM:
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int i,j=0,count=1,k;
        k=A.get(0);
        int N=A.size();
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                    if(A.get(i)==A.get(j)){
                        count++;
                    }
                    else{
                        count--;
                        if(count==0){
                            k=A.get(i);
                            count=1;
                        }
                    }
                
                
            }
        }
        return k;
    }
}
