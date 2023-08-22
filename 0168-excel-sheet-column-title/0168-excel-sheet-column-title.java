class Solution {
    public String convertToTitle(int coln) {
      String str="";
        while(coln>0){
          coln--;
          int rem=coln%26;
          str=(char)('A'+rem)+str;
          coln/=26;
        }
      return str;
    }
}