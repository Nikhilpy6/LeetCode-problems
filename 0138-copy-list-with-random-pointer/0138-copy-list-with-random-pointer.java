/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
//         Node cur = head;
//       while(cur!=null){  // inserting new nodes
//         Node temp = cur.next;
//         cur.next=new Node(cur.val);
//         cur.next.next=temp;
//         cur=temp;
//       }
//       cur=head;
//       while(cur!=null){
//         if(cur.next!=null){
//           cur.next.random=(cur.random!=null)?cur.random : null;
//         }
//         cur=cur.next.next;
//       }
      
//       Node orig=head,copy=head.next;
//       Node temp=copy;
//       while(orig!=null){
//         orig.next=orig.next.next;
//         copy.next=copy.next.next;
//         orig=orig.next;
//         copy=copy.next;
//       }
//       return temp;
      
      
      
      
      if (head == null)
      return null;
    if (map.containsKey(head))
      return map.get(head);

    Node newNode = new Node(head.val);
    map.put(head, newNode);
    newNode.next = copyRandomList(head.next);
    newNode.random = copyRandomList(head.random);
    return newNode;
  }

  private Map<Node, Node> map = new HashMap<>();
    
}