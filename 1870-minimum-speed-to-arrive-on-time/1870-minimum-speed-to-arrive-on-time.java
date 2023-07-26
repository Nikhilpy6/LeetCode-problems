class Solution {
   double possible(int[] dist,int speed){
     double s=0.0;
     int n=dist.length;
     for(int i=0;i<n-1;i++){
       double t=dist[i]*1.0/speed;
       // System.out.println(t);
       s+=Math.ceil(t);
     }
     s+=dist[n-1]*1.0/speed;
     return s;
     
   }
  
  
  
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=0;
      int r=(int)(1e7);
      int min=-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(possible(dist,mid)<=hour){
          min=mid;
          r=mid-1;
          
        }
        else
          l=mid+1;
      }
      return min;
    }
}