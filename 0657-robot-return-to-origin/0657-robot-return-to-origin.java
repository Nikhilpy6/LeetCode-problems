class Solution {
     
    public boolean judgeCircle(String moves) {
        int l=0,r=0;
      for(int i=0;i<moves.length();i++){
        if(moves.charAt(i)=='U')l++;
        else if(moves.charAt(i)=='D')l--;
        else if(moves.charAt(i)=='L')r--;
        else r++;
      }
      return l==0 & r==0;
    }
}