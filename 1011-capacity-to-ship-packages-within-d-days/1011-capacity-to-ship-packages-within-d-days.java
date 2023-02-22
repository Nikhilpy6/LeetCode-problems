class Solution {
    private boolean isPossibleDistribution(int []weights,int mid,int days){
      int currDays=1;
      int packages=0;
      for(int i:weights){
        if(packages+i<=mid){
          packages+=i;
        }
        else{
          currDays++;
          if(currDays>days || i>mid)
            return false;
          packages=i;
        }
        
      }
      return true;
      
    }
    public int shipWithinDays(int[] weights, int days) {
        int en=0,s=0,ans=-1;
      for(int weight:weights){
        en+=weight;
        s=Math.max(s,weight);
        
      }
      while(s<=en){
        int mid=en+(s-en)/2;
        if(isPossibleDistribution(weights,mid,days)){
          ans=mid;
          en=mid-1;
        }
        else{
          s=mid+1;
        }
      }
      return ans;
    }
}