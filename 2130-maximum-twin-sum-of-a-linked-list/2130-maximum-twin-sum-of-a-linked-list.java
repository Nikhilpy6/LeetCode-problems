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
    public int pairSum(ListNode head) {
        int n =0;
      ListNode tem = head;
      while(tem!=null){
        n++;
        tem= tem.next;
      }
      Stack<Integer> st = new Stack<>();
      tem=head;
      for(int i=0;i<n/2;i++){
        st.add(tem.val);
        tem=tem.next;
      }
      int max=0;
      while(tem!=null){
        int val = tem.val + st.peek();
        st.pop();
        max = Math.max(max,val);
        tem=tem.next;
      }
      return max;
    }
}