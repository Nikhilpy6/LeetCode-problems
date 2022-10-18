class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length()==0)return true;
      //if(s.length()>t.length())return false;
      int i=0;  //for string t
      int j=0;  //for string s
      while(i<t.length()){
        if(t.charAt(i)==s.charAt(j))
          j++;
        if(j==s.length())
          return true;
        i++;
      }
      return false;
        
    }
}