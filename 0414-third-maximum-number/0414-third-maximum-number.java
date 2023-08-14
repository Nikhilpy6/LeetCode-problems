class Solution {
    public int thirdMax(int[] nums) {
      Set<Integer> s = new HashSet<>();
      for(int i:nums)s.add(i);
        PriorityQueue<Integer> pq =new PriorityQueue<>();
      
      for(int i:s){
        pq.add(i);
      }
      if(pq.size()<3)return Arrays.stream(nums).max().getAsInt();
      while(pq.size()>3){
        pq.poll();
        
      }
      return pq.peek();
      
    }
}