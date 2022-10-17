class Solution {
    public String reverseWords(String s) {
        int j=s.length()-1;
      String res="";
      while(j>=0){
        while(j>=0 && s.charAt(j)==' '){
          j--;
        }       
        
        int i=j;
        if(j<0)break;
        while(j>=0 && s.charAt(j)!=' '){
          j--;
        }
        if(res.length()==0){
          res+=s.substring(j+1,i+1);
        }
        else{
          res+=" " + s.substring(j+1,i+1);
        }
      }
      return res;
    }
}