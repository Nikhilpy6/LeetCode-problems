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
    public ListNode Middle(ListNode head){
      ListNode slow=head;
      ListNode fast=head.next;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
    }
    
    public static ListNode merge(ListNode p1,ListNode p2){
    if(p1==null || p2==null)
      return( p1==null) ? p2 :p1 ;
    ListNode ans=new ListNode(0);
    ListNode cur=ans;
    while(p1!=null && p2!=null){
    if(p1.val<p2.val){
      cur.next=p1;
      p1=p1.next;
    }
    else{
      cur.next=p2;
      p2=p2.next;
    }
      cur=cur.next;
    }
    if(p1!=null || p2!=null){
      cur.next=(p1!=null)? p1 :p2;
    }
    return ans.next;
  }
  
    public ListNode sortList(ListNode head) {
      if(head==null || head.next==null)return head;
        
        
        ListNode mid = Middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        //recursive calls to sort both halves

        left = sortList(left);
        right = sortList(right);

         //merge both left and right halves
        ListNode result = merge(left, right);

        return result;
    }
  
}