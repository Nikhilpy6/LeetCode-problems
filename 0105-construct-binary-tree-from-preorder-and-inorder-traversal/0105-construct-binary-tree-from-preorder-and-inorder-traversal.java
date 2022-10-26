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
    public TreeNode build(int []preorder,int preStart,int preEnd,int []inorder,int inStart,int inEnd,Map<Integer,Integer> mapin){
      
      if(preStart>preEnd || inStart>inEnd)return null;
      
      TreeNode root= new TreeNode(preorder[preStart]);
      
      int inRoot= mapin.get(root.val); //preorder = [3,9,20,15,7]
      int numsLeft= inRoot-inStart;  // inorder = [9,3,15,20,7]
     
      root.left=build(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,mapin);
      
      root.right=build(preorder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,mapin);
      
      
      
      return root;
      
      
    }
  
  
  
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mapin = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
          mapin.put(inorder[i],i);
        }
      TreeNode root= build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mapin);
      return root;
    }
}