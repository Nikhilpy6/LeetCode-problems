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
    public void  solve(TreeNode node,int val,int d,int curr){
      if(node==null)return;
      if(curr==d-1){
        TreeNode temp=node.left;
        node.left=new TreeNode(val);
        node.left.left=temp;
        temp=node.right;
        node.right=new TreeNode(val);
        node.right.right=temp;
      }
      else{
        solve(node.left,val,d,curr+1);
        solve(node.right,val,d,curr+1);
      }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
      if(depth==1){
        TreeNode newnode=new TreeNode(val);
        newnode.left=root;
        return newnode;
      }
     solve(root,val,depth,1);
     return root;
    }
}