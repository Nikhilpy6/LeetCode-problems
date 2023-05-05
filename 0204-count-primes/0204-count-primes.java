class Solution {
    public int countPrimes(int n) {
      if(n<=2)return 0;
      boolean prime[]=new boolean[n];
      Arrays.fill(prime,true);
      int p=2;
      while(p*p<n){
        if(prime[p]==true){
          
          for(int i=p*2;i<n;i+=p){
            prime[i]=false;
          }
          
        }
        p++;
      }
      int c=0;
      for(int i=2;i<prime.length;i++){
        
        if(prime[i]==true)c++;
      }
      
        return c;  
        
    }
}