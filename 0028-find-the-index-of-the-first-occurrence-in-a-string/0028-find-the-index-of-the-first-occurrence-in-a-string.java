class Solution {
    public int strStr(String haystack, String needle) {
     //  return   haystack.indexOf(needle) ;
      for(int i=0;i<=haystack.length()-needle.length();i++){
        int k=0;
        while(k<needle.length() && haystack.charAt(k+i)==needle.charAt(k))
          k++;
        if(k==needle.length())
          return i;
      }
      return -1;
        
        
        
      
       
    }
}