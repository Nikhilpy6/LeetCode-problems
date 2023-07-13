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
    public void InOrder(TreeNode root,List<Integer> a1){
      if(root==null)return;
      
      InOrder(root.left,a1);
      
      a1.add(root.val);
      
      InOrder(root.right,a1);
      
      
      
    }
  
   
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
       InOrder(root1,a1);
       InOrder(root2,a2);
      
      int i=0,j=0;
      
      while(i<a1.size() && j<a2.size()){
        
        if(a1.get(i)<a2.get(j)){
          ans.add(a1.get(i));
          i++;
          
        }
        else{
          ans.add(a2.get(j));
          j++;
          
        }
        
      }
      while(i<a1.size()){
        
        ans.add(a1.get(i));
        i++;
      }
       while(j<a2.size()){
        
        ans.add(a2.get(j));
        j++;
      }
      
      
      return ans;
      
    }
}