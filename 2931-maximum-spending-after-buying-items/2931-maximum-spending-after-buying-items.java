class Solution {
    public long maxSpending(int[][] values) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i[]:values){
          for(int j:i){
            pq.add(j);
          }
        }
        long ans=0;
        long d=1;
        while(!pq.isEmpty()){
          ans+=d * pq.poll();
          d++;

        }
        return ans;
    }
}
