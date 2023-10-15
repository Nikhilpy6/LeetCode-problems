class Solution {
    int t[][];
  int mod =(int)(1e9+7);
    public int solve(int idx,int steps,int len){
      
      if(steps==0){
        return idx==0 ? 1:0;
      }
      
      if(t[idx][steps]!=-1)return t[idx][steps];
      
      int res=solve(idx,steps-1,len)%mod;
     if (idx < t.length - 1) 
         res = (res + solve(idx+1,steps-1,len))%mod;
     if(idx>0)
        res =( res + solve(idx-1,steps-1,len))%mod;
      
     t[idx][steps]= res;
      
      
    return res;
      
      
    }
  
 
    public int numWays(int steps, int arrLen) {
        // right
        // left
        // stay
    arrLen = Math.min(steps, arrLen);
    t=new int[arrLen][steps+1];
      for(int i[]:t){
        Arrays.fill(i,-1);
      }
      
    return solve(0,steps,arrLen);
     // return 4 ;
    }
}