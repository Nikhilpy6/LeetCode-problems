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
    public void reorderList(ListNode head) {
        Stack<ListNode> a =new Stack<>();
        ListNode temp=head;
        while(temp!=null){
          a.add(temp);
          temp=temp.next;
        }
       temp=head;
      int n=a.size();
      if(n<=2)return;
      ListNode ne;
      for(int i=0;i<n/2;i++){
        ne=temp.next;
        temp.next=a.peek();
        a.pop();
        temp=temp.next;
        temp.next=ne;
        temp=temp.next;
        
      }
      temp.next=null;

      
    }
}