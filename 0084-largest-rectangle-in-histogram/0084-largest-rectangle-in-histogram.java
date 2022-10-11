class Solution {
    public int largestRectangleArea(int[] heights) {
      
      //best solution to finding largest rectangle areA ins histogram...==>formula (height [i]* right-left-1)
      //another solution by using leftsmall[] and rightsmall[]
      //for using 2 arrays ==> formula (height[i]*right-left+1)
      
      Stack<Integer> st= new Stack();
      int maxarea=0;
      int n=heights.length;
      for(int i=0;i<=n;i++){
        while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
          int h=heights[st.peek()];
          st.pop();
          int width;
          if(st.isEmpty())width=i;
          else width=i-st.peek()-1;
          maxarea=Math.max(maxarea,width*h);
        }
        st.push(i);
        
        
      }
      return maxarea;
    }
}