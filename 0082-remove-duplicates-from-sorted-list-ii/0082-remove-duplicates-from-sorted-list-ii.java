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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode newList = new ListNode();
        // Create a copy of the head of the new LinkedList
        ListNode newListHead = newList;

        // Iterate over the list
        while(head != null){
            // Keep track of whether or not we moved over a chunk of duplicated
            boolean wentOverAChunk = false;
            // This while loop jumps over the chunk of duplicated
            while(head.next != null && head.next.val == head.val){
                head = head.next;
                wentOverAChunk = true; // Set to true if we encountered duplicates
            }
            // If we haven't encountered duplicates, add a copy of the node to the newList
            if(!wentOverAChunk){
                newList.next = new ListNode(head.val);
                newList = newList.next;
            }
            head = head.next;
        }
        return newListHead.next;
    }
}