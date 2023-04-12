class Solution {
    public String simplifyPath(String path) {
        String str[]=path.split("/");
        Stack<String> st = new Stack<>();;
      for(String s: str){
        if(!st.isEmpty() && s.equals(".."))st.pop();
        if(!s.equals(".") && !s.equals("..") && !s.equals(""))st.push(s);
      }
      if(st.size()==0)return "/";
      StringBuilder sb =new StringBuilder();
      for(String stack:st){
        sb.append('/').append(stack);
      }
      return sb.toString();
    }
}