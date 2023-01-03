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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
      int flag=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
       while(!q.isEmpty()){
         List<Integer> list =new ArrayList<>();
         int s=q.size();
         while(s>0){
         TreeNode cur=q.poll();
         list.add(cur.val);
         if(cur.left!=null)q.offer(cur.left);
         if(cur.right!=null)q.offer(cur.right);
           s--;
         }
         if(flag%2==1){
           Collections.reverse(list);
           ans.add(list);
         }
         else{
           ans.add(list);
         }
         flag++;
       }
      return ans;
        
      
    }
}