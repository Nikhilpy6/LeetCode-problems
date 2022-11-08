/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      if(head==null)return null;
      ListNode curr =head;
      Set<ListNode> vis =new HashSet<>();
      while(curr!=null){
        if(vis.contains(curr))
          return curr;
        vis.add(curr);
        curr=curr.next;
      }
      return null;
    }
}