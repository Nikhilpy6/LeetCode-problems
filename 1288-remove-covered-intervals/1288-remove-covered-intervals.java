class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
      Arrays.sort(intervals,(a,b)-> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
      int a=intervals[0][0],b=intervals[0][1];
      int c=1;
        for(int i=1;i<intervals.length;i++){
          
          int c1=intervals[i][0];
          int c2=intervals[i][1];
          
          
          if(c1>=a && c2<=b){
            continue;
            
          }
          else
          {
            c+=1;
            a=c1;
            b=c2;
          }
            
        }
      return c;
    }
}