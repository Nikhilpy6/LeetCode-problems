class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
      int sum=0;
      for(int i=0;i<arr.length;i++){
        int l=i+1;
        int r=arr.length-i;
        int o=((l*r)+1)/2;
        sum+=arr[i]*(o);
      }
      return sum;
    }
}