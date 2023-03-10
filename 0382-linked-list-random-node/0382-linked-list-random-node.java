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
    private ListNode head;
    private Random random;
    public Solution(ListNode head) {
        this.head=head;
        random=new Random();
    }
    
    public int getRandom() {
        int c=0;
      int ans=0;
      ListNode curr=head;
      while(curr!=null){
        c++;
        if(random.nextInt(c)==0){
          ans=curr.val;
        }
        curr=curr.next;
      }
      return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */