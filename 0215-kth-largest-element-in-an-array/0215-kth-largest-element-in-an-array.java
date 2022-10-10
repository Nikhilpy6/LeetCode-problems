class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Arrays.sort(nums);
        //return nums[nums.length-k];
      
    PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
        
      }
      
      while(k>0){
         k--;
        if(k!=0)
          pq.poll();
       
      }
     return pq.peek(); 
    }
}