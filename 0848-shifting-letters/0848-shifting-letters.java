class Solution {
    public String shiftingLetters(String s, int[] shifts) {
      int n = s.length();
      int prev=0;
      StringBuilder str =new StringBuilder();
        for(int i=n-1;i>=0;i--){
          prev+=shifts[i];
          char ch = s.charAt(i);
          prev=prev%26;
          int cv = (int)(ch)+prev;
          if(cv>=123){
            cv%=123;
            str.append((char)(cv+97));
          }
          else{
            str.append((char)(cv));
          }
         // System.out.println(cv);
         
        }
       return str.reverse().toString();
    }
}