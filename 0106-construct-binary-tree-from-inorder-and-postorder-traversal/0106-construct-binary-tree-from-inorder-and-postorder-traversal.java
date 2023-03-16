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
   
   /*public TreeNode func(int[] inorder,int[] postorder,int si,int ei,int sp,int ep, HashMap<Integer,Integer>hm){
      if(si>ei || sp>ep)return null;
      TreeNode root=new TreeNode(postorder[ep]);
      int ind=hm.get(postorder[ep]);
      
      int insize=ind-si;
      root.left=func(inorder,postorder,si,insize-1,sp+insize-1,ep,hm);
      root.right=func(inorder,postorder,insize+1,ei,sp+insize,ep-1,hm);
      return root;   
      
      
    }
  
  
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      if(inorder==null || postorder==null || inorder.length!=postorder.length)
        return null;
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<inorder.length;i++){
        hm.put(inorder[i],i);
      }
        int i=inorder.length-1;
        int p=postorder.length-1;
        return func(inorder,postorder,0,i,0,p,hm);
    }*/
   int index=0;
   public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        index = postorder.length-1;
        return build(inorder, postorder, map, 0, postorder.length-1);
    }
    
    public TreeNode build(int[] inorder, int[] postorder, HashMap<Integer, Integer> map, int start, int end){
        if(start > end) return null;
        TreeNode root = new TreeNode(postorder[index--]);
        int pos = map.get(root.val);
        root.right = build(inorder, postorder, map, pos+1, end);
        root.left = build(inorder, postorder, map, start, pos-1);
        return root;
    }
}