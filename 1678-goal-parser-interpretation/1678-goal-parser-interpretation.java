class Solution {
    public String interpret(String command) {
      
      String ans=command.replace("()","o");
      ans=ans.replace("(al)","al");
      return ans;
      
//         Stack<Character> st =new stack<>();
//       for(int i=0;i<command.length();i++){
        
//         if(st.peek()=='('){
          
//         }
//       }
    }
}