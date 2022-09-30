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
    public ListNode reverseList(ListNode llist) {
        ListNode t;
        ListNode tail = null;
    while (llist != null) {
        t = llist.next;
       llist.next = tail;
        tail = llist;
        llist = t;
    }
    return tail;
    }
}