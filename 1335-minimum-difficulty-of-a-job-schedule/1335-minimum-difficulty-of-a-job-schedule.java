class Solution {
   public int solution(int []jobDifficulty,int idx,int d,int [][]dp){
    // if(d>jobDifficulty.length())return -1;
     if(d==1){
       int mx=0;
       for(int i=idx;i<jobDifficulty.length;i++){
         mx=Math.max(mx,jobDifficulty[i]);
       }
       return mx;
     }
     if(dp[d][idx]!=-1)return dp[d][idx];
     int mx=0;
     int res=Integer.MAX_VALUE;
     for(int i=idx;i<jobDifficulty.length-d+1;i++){
       mx=Math.max(mx,jobDifficulty[i]);
       res=Math.min(res,mx+solution(jobDifficulty,i+1,d-1,dp));
     }
     return dp[d][idx]=res;
     
   }
  
  
    public int minDifficulty(int[] jobDifficulty, int d) {
      if(d>jobDifficulty.length)return -1;
        int dp[][]= new int[d+1][jobDifficulty.length];
      for(int []a:dp){
        Arrays.fill(a,-1);
      }
        return solution(jobDifficulty,0,d,dp);
      }
}