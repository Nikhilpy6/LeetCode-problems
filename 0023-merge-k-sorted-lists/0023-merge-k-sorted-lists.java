/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      if (lists==null || lists.length==0) return null;
        PriorityQueue <ListNode> pq =new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
      ListNode node = new ListNode(0);
      ListNode temp=node;
      
      for(ListNode n:lists){
        if(n!=null)
          pq.add(n);
      }
      
      while(!pq.isEmpty()){
        temp.next=pq.poll();
        temp=temp.next;
        
        if(temp.next!=null)
          pq.add(temp.next);
      }
      return node.next;
    }
}