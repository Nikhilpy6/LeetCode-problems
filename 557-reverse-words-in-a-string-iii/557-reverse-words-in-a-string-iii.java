class Solution {
    public String reverseWords(String s) {
        String str="";
        String arr[]=s.split(" ");
      for( String i:arr){
        
        StringBuilder sb = new StringBuilder(i);
        sb.reverse();
        str+=sb.toString()+" ";
      }
      return str.trim();
    }
}