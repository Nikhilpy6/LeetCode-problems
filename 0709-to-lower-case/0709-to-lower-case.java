class Solution {
    public String toLowerCase(String s) {
      String ans="";
      for(int i=0;i<s.length();i++){
        int a=(int)s.charAt(i);
         // System.out.print(a+"*");
        if(a>64 && a<91){
          char ch=(char)(a+32);
          ans+=ch;
            // System.out.print(ch+"#");
        }
        else{
          ans+=s.charAt(i);
        }
      }
      return ans;
        // return s.toLowerCase();
    }
}