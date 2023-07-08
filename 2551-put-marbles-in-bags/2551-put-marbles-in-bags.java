class Solution {
    public long putMarbles(int[] weights, int k) {
      int n=weights.length;
        int ar[]=new int[n-1];
      for(int i=0;i<n-1;i++){
        ar[i]=weights[i]+weights[i+1];
      }
      
      Arrays.sort(ar);
      int i=0,j=ar.length-1;
      long ans=0;
      while(k>1){
        ans+=(ar[j]-ar[i]);
        i++;
        j--;
        k--;
      }
      return ans;     
                          
                          
    }
}