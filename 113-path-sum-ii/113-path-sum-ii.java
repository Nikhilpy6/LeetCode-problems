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
 
 
  }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        paths(res,targetSum,root,new ArrayList());
        return res;
        
    }
    private void paths(List<List<Integer>> res,int sum,TreeNode root,List<Integer>list){
        if(root==null)
            return;
        list.add(root.val);
        
        if(root.left==null && root.right==null && root.val==sum ){
            res.add(new ArrayList(list));
        }
        paths(res,sum-root.val,root.left,list) ;
        paths(res,sum-root.val,root.right,list);
         list.remove(list.size()-1); 
            
    }
}