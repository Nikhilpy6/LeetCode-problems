class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
      int prev = -1,ans=0;
      for(int i=0;i<intervals.length;i++){
        
        int cur2 = intervals[i][1];
        
        
        if(cur2<=prev){
          ans++;
        }
        prev = Math.max(prev,cur2);
        
        
      }
      return intervals.length-ans;
    }
}