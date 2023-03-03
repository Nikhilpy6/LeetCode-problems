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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        String pth=Integer.toString(root.val);
        if(root==null)return null;
      if(root.left==null && root.right==null)res.add(pth);
      if(root.left!=null) dfs(root.left,pth,res);
      if(root.right!=null)dfs(root.right,pth,res);
      return res;
    }
  
    public void dfs(TreeNode node,String pth, List<String> res){
      pth+="->"+node.val;
      if(node.left==null && node.right==null){res.add(pth);
                                              return;}
      if(node.left!=null)dfs(node.left,pth,res);
      if(node.right!=null)dfs(node.right,pth,res);
    }
}