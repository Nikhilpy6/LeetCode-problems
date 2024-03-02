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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int ans=0;
        while(!qu.isEmpty()){
          int s = qu.size();
          for(int i=0;i<s;i++){

            TreeNode cur = qu.poll();
            if(i==0)ans =cur.val;
            if(cur.left!=null){
              qu.offer(cur.left);
            }
            if(cur.right!=null){
              qu.offer(cur.right);
            }
            
          }
        }
      return ans;
    }
}