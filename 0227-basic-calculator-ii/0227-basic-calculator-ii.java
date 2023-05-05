class Solution {
    public int calculate(String s) {
        // 
      int ans=0;
      int k=0;
      Stack<Integer> st= new Stack();
      int num=0;
      char op='+';
      for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i)))
          num = num*10+(s.charAt(i)-'0');
        if( k==s.length()-1 || (!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ') ){
          if(op=='+')
            st.push(num);
          else if(op=='-')
            st.push(-num);
          else if(op=='*')
            st.push(st.pop()*num);
          
          else if(op=='/')
            st.push(st.pop()/num);
          
          op=s.charAt(i);
          num=0;
        }
           k++;
      }
      while(!st.isEmpty())
        ans+=st.pop();
      
      return ans;
    }
  
}