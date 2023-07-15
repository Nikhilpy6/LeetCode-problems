class Solution {
    public int maxEvents(int[][] events) {
      Arrays.sort(events,(a,b)->a[0]-b[0]);
      int dayCount = 0;
        int i = 0;
        int n = events.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int d=1; d<=100000; d++) {
            while (i<n && events[i][0] == d)
                pq.add(events[i++][1]);
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
            if (!pq.isEmpty()) {
                dayCount += 1;
                pq.poll();
            }
        }
        return dayCount;
    }
}