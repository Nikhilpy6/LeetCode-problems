/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

  //max from left
  
  
  //min from right
    int result=Integer.MIN_VALUE;
  
  //min,max,sum
    public int[] recursion(TreeNode root){
      
      if(root==null)return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
      
      int []left=recursion(root.left);
      int []right=recursion(root.right);
      
      if(left[1]>=root.val || right[0]<=root.val)
        return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,0};
        
//       System.out.println("left--> "+ left[0] + ","+ left[1] +","+ left[2]);
    
      int sum = left[2] + root.val + right[2];
      result=Math.max(result,sum);
      return new int[]{Math.min(left[0],root.val),Math.max(right[1],root.val),sum};
        
    
    }   
  
    public int maxSumBST(TreeNode root) {
      
      recursion(root);
      return result< 0 ? 0 : result;
    }
}