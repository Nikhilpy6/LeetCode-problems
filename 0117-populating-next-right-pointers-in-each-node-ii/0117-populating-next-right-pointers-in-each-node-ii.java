/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public void bfs(Node root){
      Queue<Node> q = new LinkedList<>();
      
      q.offer(root);
      
      while(!q.isEmpty()){
        int s=q.size();
        Node prevnode=null;
        while(s-- >0){
          Node cur=q.poll();
          cur.next=prevnode;
          prevnode=cur;
          
         
          if(cur.right!=null)q.add(cur.right);
          if(cur.left!=null)q.add(cur.left);
          
         }       
        }
      
      
      
    }
  
  
  
    public Node connect(Node root) {
        if(root==null)return null;
      
        bfs(root);
       return root;
    }
}