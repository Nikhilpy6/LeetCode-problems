class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
      int maxX=0,maxY=0,ans=0;
        for(int i=1;i<points.length;i++){
          int x=points[i][0];
          int y=points[i][1];
          
          maxX=Math.abs(x-points[i-1][0]);
          maxY=Math.abs(y-points[i-1][1]);
          
          ans+=Math.max(maxX,maxY);
          
        }
      return ans;
    }
}