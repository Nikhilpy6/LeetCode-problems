class Solution {
    public boolean squareIsWhite(String coordinates) {
        int v1=coordinates.charAt(0)-'a';
        int v2=coordinates.charAt(1)-'0';
      if((v1%2==0 && v2%2==0)||(v1%2!=0 && v2%2!=0))
        return true;
      else
        return false;
    }
}