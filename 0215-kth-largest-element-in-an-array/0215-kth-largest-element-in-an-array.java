class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Arrays.sort(nums);
        //return nums[nums.length-k];
      
      
     //priorityQueue in java store the values in minheap by default
    PriorityQueue<Integer> pq =new PriorityQueue<>();
      for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
        
      } 
      
      
      while(k<pq.size()){
         
        pq.poll();
        
       
      }
     return pq.peek(); 
    }
}