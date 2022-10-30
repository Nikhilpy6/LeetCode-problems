class Solution {
    public String decodeString(String s) {
        Stack<Integer>  number = new Stack<>();
        Stack<String> st = new Stack<>();
        String res="";
        int i=0;
      
      while(i<s.length()){
        if(Character.isDigit(s.charAt(i))){
          int count=0;
          while(Character.isDigit(s.charAt(i))){
          count=(count*10)+(s.charAt(i)-'0');
            i++;
          }
          number.push(count);
        }
        else if(s.charAt(i)=='['){
          st.push(res);
          res="";
          i++;
          
        }
        else if(s.charAt(i)==']'){
          
        StringBuilder temp = new StringBuilder(st.pop());
          int count=number.pop();
          for(int in=0;in<count;in++){
            temp.append(res);
          }
          res=temp.toString();
          i++;
        }
        else{
          res+=s.charAt(i);
          i++;
        }
      }
      return res;
    }
}