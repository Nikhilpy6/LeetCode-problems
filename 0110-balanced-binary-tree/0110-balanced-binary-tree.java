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
    public int isBal(TreeNode root){
      if(root==null)return 0;
      
      int left_tree=isBal(root.left);
      
      int right_tree=isBal(root.right);
      
      if(left_tree==-1 || right_tree==-1)return -1;
      
      if(Math.abs(right_tree-left_tree)>1)return -1;
       System.out.println(Math.max(left_tree,right_tree));
      return Math.max(left_tree,right_tree)+1;
      
      
    }
  
  
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        return isBal(root) !=-1 ? true: false;
    }
}