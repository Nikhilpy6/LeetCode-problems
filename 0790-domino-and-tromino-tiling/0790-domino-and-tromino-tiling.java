class Solution {
    public int numTilings(int n) {
      int mod=(int)(1e9+7);
        int f=1;
      int s=2;
      int t=5;
      if(n==1)return f;
      if(n==2)return s;
      if(n==3)return t;
      int a=0;
      for(int i=4;i<=n;i++){
        a=((2*t)%mod + (f)%mod)%mod;
        f=s;
        s=t;
        t=a;
        
      }
      return a;
    }
}