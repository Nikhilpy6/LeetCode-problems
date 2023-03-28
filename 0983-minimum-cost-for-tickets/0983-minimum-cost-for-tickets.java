class Solution {
    
    private int recursion(int n,int []days,int []costs,int ind,int []dp){
      if(ind>=n)
        return 0;
      if(dp[ind]!=-1)return dp[ind];
      
      //cost[0]--> 1 day pass
      int day1=costs[0]+recursion(n,days,costs,ind+1,dp);
      
      
      //cost[1]---> 7day pass
      int i;
      for( i=ind;i<n && days[i]<days[ind]+7;i++);
  
      int day7=costs[1]+recursion(n,days,costs,i,dp);
      
      //cost[2]--> 30 day pass
      
      for( i=ind;i<n && days[i]<days[ind]+30;i++);
      
      int day30=costs[2]+recursion(n,days,costs,i,dp);
      
      
      dp[ind]= Math.min(day1,Math.min(day7,day30));
      return dp[ind];
    }
  
  
    public int mincostTickets(int[] days, int[] costs) {
        //three calls
      
      int n=days.length;
      int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
      return  recursion(n,days,costs,0,dp);        
      
    }
}