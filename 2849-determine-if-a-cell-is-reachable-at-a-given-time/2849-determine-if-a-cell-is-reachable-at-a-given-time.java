class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int a = Math.abs(sx-fx);
        int b = Math.abs(sy-fy);
      
     if(a==0 && b==0 && t==1)return false;
      
        
      return t>= Math.max(a,b);
    }
}