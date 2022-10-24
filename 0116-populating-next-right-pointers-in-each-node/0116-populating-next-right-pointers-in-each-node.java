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
    public Node connect(Node root) {
      /*Queue<Node>q = new Queue<>();
      if(root==null)
        return root;
      q.offer(root);
      while(!q.isEmpty){
        int size=q.size();
        
        if(size==0)
          return root;
        
        while(size>0){
          Node temp;
           
          if(size>1){
            temp=q.poll();
            Node nextAd=q.peek();
            temp.next=nextAd;
          }
          else{
            temp=q.poll();
          }
          if(temp.left!=null)
            q.add(temp.left);
          if(temp.right!=null)
            q.add(temp.right);
          
          size--;
        }
          
          
      }
      return root;*/
      
      
      if(root==null)
        return root;
      
      Node temp=root;
      while(temp.left!=null){
        Node cur=temp;
        while(temp!=null){
          temp.left.next=temp.right;
          temp.right.next= temp.next ==null ? null : temp.next.left;
          temp=temp.next;
        }
        temp=cur.left;
      }
      return root;
    }
}