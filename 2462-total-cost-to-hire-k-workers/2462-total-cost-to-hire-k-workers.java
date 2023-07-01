class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans=0;
      int n=costs.length;
      int i=0;
      int j=n-1;
      int hired=0;
      PriorityQueue<Integer> pq1 =new PriorityQueue<>();
      PriorityQueue<Integer> pq2 =new PriorityQueue<>();
      
      
      
      while(hired<k){
        
        while(pq1.size()<candidates && i<=j){
          pq1.add(costs[i]);
          i++;
        }
        
        while(pq2.size()<candidates && j>=i){
          pq2.add(costs[j]);
          j--;
        }
        
        int minpq1=pq1.size()>0 ? pq1.peek() :Integer.MAX_VALUE;
        int minpq2=pq2.size()>0 ? pq2.peek() :Integer.MAX_VALUE;
        
        if(minpq1 <= minpq2){
          ans+=(long)(pq1.poll());
          
        }
        else{
          
          ans+=(long)(pq2.poll());
        }
        
        hired++;
        
      }
      return ans;
    }
}