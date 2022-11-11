class Solution {
    
    public String removeDuplicates(String s, int k) {
      Stack<pair>st =new Stack<>();
      for(int i=0;i<s.length();i++){
        if(st.isEmpty()){
          pair p=new pair(s.charAt(i),1);
          st.push(p);
        }
        else if(st.peek().ch==s.charAt(i)){
          if(st.peek().freq<k-1)
            st.peek().freq +=1;
          else
            st.pop();
        }
        else{
          pair p=new pair(s.charAt(i),1);
          st.push(p);
        }
        
      }
      StringBuilder sb= new StringBuilder();
      for(pair pp:st){
        while(pp.freq -- >0)
          sb.append(pp.ch);
      }
      return sb.toString();
    }
  class pair{
      char ch;
      int freq;
      
      pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
      }
    }
}
