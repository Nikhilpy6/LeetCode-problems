class Solution {
    public String minRemoveToMakeValid(String s) {
      
      Stack<Integer> st = new Stack<>();
      StringBuilder sb = new StringBuilder(s);
      
      boolean open=false;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
          st.push(i);
        }
        else if(s.charAt(i)==')'){
          if(st.isEmpty())
            sb.setCharAt(i,'$');
          else
            st.pop();
        }
      }
        while(!st.empty()){
          sb.setCharAt(st.pop(),'$');
          
        }
        
       
       String  ans=sb.toString().replace("$","");
      return ans;
    }
}