class Solution {
    public static int logVal(int i){
      int res=(int)(Math.log(i) / Math.log(2))+1;
      return res;
    }
    public int concatenatedBinary(int n) {
        long  val =0;
        int i=1;
        while(i<=n){
            val=((val << logVal(i))%1000000007 + i)%1000000007;
            i++;
        }
        return (int)val;
    }
}