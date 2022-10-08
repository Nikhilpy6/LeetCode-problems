class Solution {
    public int tribonacci(int n) {
      
      int prev0=0;
      int prev1=1;
      int prev2=1;
      if(n<=1)return n;
      if(n==2)return 1;
     
      int p;
      for(int i=3;i<=n;i++){
        p=prev2;
        prev2=prev2+prev1+prev0;
        prev0=prev1;
        prev1=p;
        
      }
     return prev2; 
      
    }
}