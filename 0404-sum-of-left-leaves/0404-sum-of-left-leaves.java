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
    public int sumOfLeftLeaves(TreeNode root) {
      // all leaves sum
      // if(root.left==null && root.right==null)return 0;
      // Queue<TreeNode> q =new LinkedList<>();
      // q.offer(root);
      // int ans=0;
      // while(!q.isEmpty()){
      //   int s=q.size();
      //   while(s-->0){
      //     TreeNode cu =q.poll();
      //     if(cu.left!=null)q.add(cu.left);
      //     if(cu.right!=null)q.add(cu.right);
      //     if(cu.left==null && cu.right!=null)ans+=cu.val;
      //   }
      // }
      // return ans;
       if (root == null) {
            return 0; 
        }
      int ans=0;
      if(root.left!=null && root.left.left==null && root.left.right==null)
        ans+=root.left.val;
      
      return ans+ sumOfLeftLeaves(root.left) +  sumOfLeftLeaves(root.right);
    }
}