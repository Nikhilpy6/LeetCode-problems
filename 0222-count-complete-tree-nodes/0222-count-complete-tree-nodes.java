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
  
    public int heightl(TreeNode root){
      if(root==null)return 0;
      
      return 1+ heightl(root.left);
      
      
    }
  
    public int heightr(TreeNode root){
      if(root==null)return 0;
      
      return 1+ heightr(root.right);
      
      
    }
  
  
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
      
      int hleft=heightl(root);
        
      int hright=heightr(root);
      if(hleft==hright){
        return (int)Math.pow(2,hleft)-1;
      }
      return 1 + countNodes(root.left) + countNodes(root.right);
    }
}