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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
      if(root==null)return result;
      Queue<TreeNode> q=new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
        int size=q.size();
        List<Integer>ans=new ArrayList<>();
        while(size-- >0){
          TreeNode v=q.poll();
          ans.add(v.val);
          if(v.left!=null)q.offer(v.left);
          if(v.right!=null)q.offer(v.right);
        }
        result.add(ans);
      }
      return result;
    }
}