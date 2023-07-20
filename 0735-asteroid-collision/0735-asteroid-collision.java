class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     
      Stack<Integer> st =new Stack<>();
      for(int i:asteroids){
               
        while(!st.isEmpty() && st.peek()>0  && i<0){
          int s=st.peek()+i;
          if(s==0){
            st.pop();
            i=0;
          }
          else if(s<0){
            st.pop();
            
          }
          else{
            i=0;
          }
        }
        
        if(i!=0) 
          st.add(i);
        
      }
      int arr[]=new int[st.size()];
      int i=st.size()-1;
      while(!st.isEmpty()){
        arr[i--]=st.pop();
      }
      
      return arr;
    }
}