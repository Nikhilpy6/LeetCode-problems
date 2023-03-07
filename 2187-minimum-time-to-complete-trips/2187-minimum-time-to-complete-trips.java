class Solution {
    private long TotaTime(long mid,int []time){
      long ans=0;
      for(int a:time){
        ans+=(mid/a);
      }
      return ans;
    }
  
    public long minimumTime(int[] time, int totalTrips) {
        long min=time[0];
        for(int i=1;i<time.length;i++){
          min=Math.min(min,time[i]);
        }
      long st=1;
      long end=min*totalTrips;
      while(st<end){
        long mid=st+(end-st)/2;
       if(TotaTime(mid,time)<totalTrips){
          st=mid+1;
        }
        else{
          end=mid;
        }
      }
      return st;
      
    }
}