class Solution {
    public String removeKdigits(String num, int k) {
        
      // Intuition is clear that is we have to make arrangement of ome number to make a smaller number we choose the keast digit first the in increasing order
      
     
      if(num.length()==k)return "0";
      StringBuilder sb = new StringBuilder(); // this is used to easilt immute the char in string
      
     for(int j=0;j<num.length();j++){
       char i=num.charAt(j);
       
       while(sb.length()>0 && sb.charAt(sb.length()-1)>i && k>0){ // work like stack
         sb.deleteCharAt(sb.length()-1);
         k--;
       }
       
       if(sb.length()>0 || i!='0'){ // preceeding zeros or character to add
         sb.append(i);
       }
       
     }
      
      while(sb.length()>0 &&  k>0){  // this loop is loop all the character string in descending order the remove from last till k==0
        sb.deleteCharAt(sb.length()-1);
        k--;
        
      }
      
      return  sb.length()==0 ? "0" : sb.toString();
    }
}