class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int j=0,sum=0,len=0,ans=0;
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          len++;
          if(len==k){
            if((sum/k)>=threshold)ans++;
            len--;
            sum-=arr[j];
            j++;
            
          }
          
        }
      return ans;
    }
}