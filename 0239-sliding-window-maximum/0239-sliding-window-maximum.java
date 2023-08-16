class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
//       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//       int arr[]=new int[nums.length-k+1];
//       int l=0,i=0;
//       for(int r=0;r<nums.length;r++){
//         pq.add(nums[r]);
//         if(pq.size()==k){
//           arr[i++]=pq.peek();
//           pq.remove(nums[l]);
//           l++;
          
//         }
//       }
//       return arr;
      
    //USING DEQUE
      int ans[]=new int[nums.length-k+1];
      int n=nums.length;
      //operations--> getFirst(),getLast(),removeFirst(),removeLast(),addFirst(),addLast()
      Deque<Integer> dq = new ArrayDeque<>();
      for(int i=0;i<k;i++){
        while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
          dq.removeLast();
        dq.addLast(i);
      }
      int idx=0;
      for(int i=k;i<n;i++){
        ans[idx++]=nums[dq.peek()];
        //checking range of window of size k
        while(!dq.isEmpty() && i-k>=dq.peek())
          dq.removeFirst();
        // removing irrelevant elements
        while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
          dq.removeLast();
        dq.addLast(i);
        
        
      }
      ans[idx]=nums[dq.peek()];
      return ans;
    }
}