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
  HashMap<Integer,TreeNode> hm;
    public void solve_Inorder(TreeNode root){
      if(root==null)return;
      
      if(root.left!=null){
        hm.put(root.left.val,root);
        solve_Inorder(root.left);
        
      }
      
      if(root.right!=null){
        hm.put(root.right.val,root);
        solve_Inorder(root.right);
        
      }
      
      
      
    }
  
  
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
      hm =new HashMap<>();
      solve_Inorder(root);
      Map<Integer,Integer> vis =new HashMap<>();
      //level order traversal for left,right ,parent(hm)
      
      Queue<TreeNode> qu =new LinkedList<>();
      qu.offer(target);
      int level=0;
      while(k>0 && !qu.isEmpty()){
        int s=qu.size();
        
        while(s-->0){
          
          TreeNode cur=qu.poll();
          vis.put(cur.val,1);
          
          if(cur.left!=null && !vis.containsKey(cur.left.val))qu.offer(cur.left);
          if(cur.right!=null && !vis.containsKey(cur.right.val))qu.offer(cur.right);
          if(hm.containsKey(cur.val) && !vis.containsKey(hm.get(cur.val).val)){
            qu.offer(hm.get(cur.val));
          }
          
        }
        k--;
        
        
      }
      
      while(!qu.isEmpty()){
        
        ans.add(qu.poll().val);
      }
      
      return ans;
      
      
    }
}