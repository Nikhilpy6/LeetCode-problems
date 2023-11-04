class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int m1=0;
      for(int i:left){
        m1=Math.max(m1,i);
      }
      for(int i:right){
        m1=Math.max(m1,n-i);
      }
      return m1;
    }
}

