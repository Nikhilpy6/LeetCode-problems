class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(String str:tokens){
            if(str.equals("+")){
              st.add(st.pop()+st.pop());
            }
          else if(str.equals("-")){
              int a=st.pop();
              int b=st.pop();
              st.add(b-a);
            
          }
          else if(str.equals("*")){
            st.add(st.pop()*st.pop());
          }
          else if(str.equals("/")){
            int a=st.pop();
            int b=st.pop();
            st.add(b/a);
          }
          else{
            st.add(Integer.parseInt(str));
          }
        }
      return st.pop();
    }
}