class Solution {
    private boolean isPossible(int weights[],int days,int mid){
      int daysCount=1;
      int load=0;
      for(int i:weights){
        if(load+i<=mid)
          load+=i;
        else{
          daysCount++;
          if(daysCount>days || i>mid)
            return false;
          load=i;
        }
      }
      return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        //similar to agressive cow where BINARY SEARCH used see how
      int max=0,right=0,left=0;
      int ans=-1;
      for(int i:weights){
        right+=i;
        max=Math.max(max,i);
      }
      left=max;
      //binary zsearch
      //right=total sum
      //left=max(arr)
      while(left<=right){
        int mid=left+(right-left)/2;
        if(isPossible(weights,days,mid)){
          ans=mid;
          right=mid-1;
        }
        else{
          left=mid+1;
        }
      }
      return ans;
      
    }
}