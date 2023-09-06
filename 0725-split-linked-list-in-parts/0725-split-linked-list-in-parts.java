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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[]=new ListNode[k];
      
      ListNode temp=head;
      int len=0;
      
      while(temp!=null){
        len++;
        temp=temp.next;
      }
      
      temp=head;
      int nofn=len/k;
      int extra=len%k;
      
      int idx=0;
      
      while(temp!=null){
        ans[idx++]=temp;
        
        int curlength = nofn - 1 + (extra-- >0 ? 1 : 0);
        for(int i=0;i<curlength;i++){
          temp=temp.next;
        }
        
        ListNode t = temp.next;
        temp.next=null;
        temp=t;
        
      }
      return ans;
        
    }
}