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
    public void func(TreeNode root , ArrayList<Integer> list){
        if(root==null)return;
        if(root.left==null && root.right==null)
            list.add(root.val);
        func(root.left,list);
        func(root.right,list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        func(root1,list1);
        func(root2,list2);
        if(list1.equals(list2))
            return true;
        return false;
    }
}