class Solution {
    public int minCost(String colors, int[] neededTime) {
      int st=0;
      int end=0;
      int totaltime=0;
      int n=colors.length();
      while(st<n && end<n){
        int maxtime=0,curtime=0;
        while(end<n && colors.charAt(st)==colors.charAt(end)){
          maxtime=Math.max(maxtime,neededTime[end]);
          curtime+=neededTime[end];
          end++;
        }
        st=end;
        totaltime+=(curtime-maxtime);
      }
      return totaltime;
    }
}