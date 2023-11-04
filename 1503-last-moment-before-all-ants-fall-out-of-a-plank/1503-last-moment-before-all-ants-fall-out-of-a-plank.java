class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int m1=0,m2=Integer.MAX_VALUE;
      for(int i:left){
        m1=Math.max(m1,i);
      }
      for(int i:right){
        m2=Math.min(m2,i);
      }
      m2=n-m2;
      return Math.max(m1,m2);
    }
}

