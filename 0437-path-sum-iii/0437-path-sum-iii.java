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
    private int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        path(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return ans;
    }
   public void path(TreeNode root,int sum){
     if(root==null)return;
     sum=sum%(int)1e9;
     if(sum==root.val)ans++;
     sum=sum-root.val;
     path(root.left,sum);
     path(root.right,sum);
   }
}