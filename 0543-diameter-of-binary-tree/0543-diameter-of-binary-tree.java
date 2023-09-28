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
    int dis=0;
  
    int recu(TreeNode root){
      if(root==null)
         return 0;
       
      
       int l=recu(root.left);
       int r=recu(root.right);
      
       dis=Math.max(dis,l+r);
       return  Math.max(l,r)+1;
       
    }
    public int diameterOfBinaryTree(TreeNode root) {
       
      recu(root);
      return dis;
    }
}