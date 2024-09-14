/*###Problem Description


You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4*/


//PROGRAM:
import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long n=A.size();
        
        long sum_n=(n * (n + 1)) / 2;
        long sum_square_n=(n * (n + 1) * (2 * n + 1)) / 6;
        
        long sum_A=0;
        long sum_square_A=0;
        
        for(int i=0;i<n;i++){
            sum_A+=A.get(i);
            sum_square_A+=(long)A.get(i)*A.get(i);
        }
        
        long diff_sum=sum_n - sum_A;
        long diff_square_sum=sum_square_n -  sum_square_A;
        
        long sum_mn_rn= diff_square_sum/diff_sum;
        long missingNumber=(sum_mn_rn+diff_sum)/2;
        long repeatedNumber=sum_mn_rn - missingNumber;
        
        ArrayList<Integer> result=new ArrayList<>();
        result.add((int)repeatedNumber);
        result.add((int)missingNumber);
        
        return result;
    }
}
