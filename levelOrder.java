/*Problem Description
 
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).



Problem Constraints
 1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



Example Input
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [
   [3],
   [9, 20],
   [15, 7]
 ]
Output 2:

 [ 
   [1]
   [6, 2]
   [3]
 ]


Example Explanation
Explanation 1:

 Return the 2D array. Each row denotes the traversal of each level.*/


//PROGRAM:
  /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        if(A==null){
            return result;
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(A);
        
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            ArrayList<Integer> levelValues=new ArrayList<>();
            
            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                levelValues.add(node.val);
                
                if(node.left!=null){
                    queue.offer(node.left);
                }
                
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(levelValues);
        }
        return result;
    }
}


