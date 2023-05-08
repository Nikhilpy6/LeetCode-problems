class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
      int ind=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
          if(points[i][0]==x || points[i][1]==y){
            int dis=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
             // System.out.print(dis+ "*");
            if(min>dis){
              min=dis;
              ind=i;
              // System.out.print(ind+"&");
            }
           }
        }
      return ind;
    }
}