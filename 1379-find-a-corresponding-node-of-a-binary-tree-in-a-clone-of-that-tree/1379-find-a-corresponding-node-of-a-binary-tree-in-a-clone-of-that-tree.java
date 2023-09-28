/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned!=null){
          if(cloned.val==target.val)
            return cloned;
          else{
            TreeNode left = getTargetCopy(original,cloned.left,target);
            TreeNode right = getTargetCopy(original,cloned.right,target);

            if(left!=null)return left;

            if(right!=null)return right;
          }
        }
      return null;
      
    }
}