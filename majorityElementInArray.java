/*###Problem Description

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
2 occurs 2 times which is greater than 3/2.*/




//PROGRAM:
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int i, j = 0, count = 1;
        int N = A.size();
        int k = A.get(0);

        // Finding the majority candidate
        for (i = 1; i < N; i++) {
            if (A.get(i) == k) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    k = A.get(i);
                    count = 1;
                }
            }
        }

        // Verify if the candidate `k` is actually the majority element
        count = 0;
        for (i = 0; i < N; i++) {
            if (A.get(i) == k) {
                count++;
            }
        }

        // Check if the count of `k` is greater than N/2
        if (count > N / 2) {
            return k;
        } else {
            // According to problem constraints, there should always be a majority element.
            throw new IllegalStateException("No majority element found");
        }
    }
}









###While running with online compiler


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.lang.*;
public  class Solution{
    public int majorityElement(final List<Integer> A){
        int i,j,count=1;
        int N=A.size();
        int k=A.get(0);
        for(i=1;i<N;i++){
            if(k==A.get(i)){
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
        
        count=0;
        for(i=0;i<N;i++){
            if(k==A.get(i)){
                count++;
            }
        }
        
        if(count>N/2){
            return k;
        }
        else{
            throw new IllegalStateException("No majority element found");
        }
    }
    
    public static void main(String args[]){
        Solution solution=new Solution();
        Scanner scanner = new Scanner(System.in);
        List<Integer> SampleList=new ArrayList<>();
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            SampleList.add(scanner.nextInt());
        }
        scanner.close();

        try{
            int majorityElement=solution.majorityElement(SampleList);
            System.out.println("Majority element is: "+ majorityElement); 
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        
    }
}
