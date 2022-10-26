public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
      //  return Integer.bitCount(n);
      int c=0;
      String s = Integer.toBinaryString(n);
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1')
          c++;
      }
      return c;
    }
}