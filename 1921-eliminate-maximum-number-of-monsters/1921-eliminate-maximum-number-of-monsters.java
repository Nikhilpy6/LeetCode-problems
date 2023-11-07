class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int cnt=1;
      int ti=0;
      int time[] = new int[speed.length];
      for(int i=0;i<speed.length;i++){
        int t =(int)Math.ceil(dist[i]/(speed[i]*1.0));
        // System.out.println(t);
        time[i] = t;
        
      }
      Arrays.sort(time);
      for(int i=1;i<time.length;i++){
        ti++;
        time[i]-=ti;
        
        
        if(time[i]==0)return cnt;
        cnt++;
      }
      
      return cnt;
    }
}
//  1 1 2 3 --> 0