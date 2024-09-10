###Problem Description
 
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 

Problem Constraints
1 <= N <= 3 * 105


Input Format
The only argument given is string A.


Output Format
Return the string A after reversing the string word by word.


Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"


Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"


Example Explanation
Explanation 1:
    We reverse the string word by word so the string becomes "the sky is blue".
Explanation 2:
    We reverse the string word by word so the string becomes "this is ib".


###PROGRAM:
public class Solution {
    public String solve(String A) {
        int N=A.length();
        String words[]=new String[N];
        int wordCount=0;
        char tempWord[]=new char[N];
        int tempIndex=0;
        for(int i=0;i<N;i++){
            char currentChar=A.charAt(i);
            if(currentChar!= ' ')
            {
                tempWord[tempIndex]=currentChar;
                tempIndex++;
            }
            else{
                if(tempIndex>0){
                    words[wordCount]=new String(tempWord,0,tempIndex);
                    wordCount++;
                    tempIndex=0;
                }
            }
        }
        if(tempIndex>0){
            words[wordCount]=new String(tempWord,0,tempIndex);
            wordCount++;
                    
        }
        
        String result="";
        for(int i=wordCount-1;i>=0;i--){
            result+=words[i];
            if(i>0){
                result+=" ";
            }
        }
        return result;
    }
}
