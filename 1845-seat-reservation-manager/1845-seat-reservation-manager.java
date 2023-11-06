class SeatManager {
    // int t[];
    // int N;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public SeatManager(int n) {
      //   t=new int[n+1];
      // this.N=n;
      for(int i=1;i<=n;i++){
        pq.add(i);
      }
    }
    
    public int reserve() {
//        for(int i=1;i<=N;i++){
//         if(t[i]==0){
//           t[i]=1;
//           return i;
          
//         }
//       }
//       return -1;
      return pq.poll();
      
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */