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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
      int c=1;
      while(c++ < k){
        temp=temp.next;
      }
      ListNode first=temp;
      ListNode second=head;
      while(temp.next!=null){
        temp=temp.next;
        second=second.next;
      }
      int fi=first.val;
      first.val=second.val;
      second.val=fi;
      
      return head;
    }
}