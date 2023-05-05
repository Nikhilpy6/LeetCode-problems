class Solution {
    public char findTheDifference(String s, String t) {
       int n=0;
       for(char c:(s+t).toCharArray()){
         n^=c;
       }
      return (char)n;
    }
}