class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
      int max=word1.length()<word2.length() ? word2.length() : word1.length();
      for(int i=0;i<max;i++){
         if (i<word1.length()){
           char a=word1.charAt(i);
           s+=a;
         }
         if(i<word2.length()){
           char b=word2.charAt(i);
           s+=b;
         }
       
      }
      return s;
    }
}