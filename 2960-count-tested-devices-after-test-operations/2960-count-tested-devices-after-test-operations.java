class Solution {
    public int countTestedDevices(int[] bP) {
        int cnt=0;
        for(int i=0;i<bP.length;i++){
          int va = bP[i]-cnt;
          
          if(va>0){
            cnt++;
          }
          
        }
      return cnt;
    }
}