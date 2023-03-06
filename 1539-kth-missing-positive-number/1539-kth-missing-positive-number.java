class Solution {
    public int findKthPositive(int[] arr, int k) {
        /*for(int i:arr){
          if(i<=k)k++;
          else break;
        }
      return k;*/
      int i=0,j=arr.length,mid=0;
      while(i<j){
        mid=(i+j)/2;
        if((arr[mid]-mid-1)<k)
          i=mid+1;
        else
          j=mid;
      }
      return i+k;
    }
}