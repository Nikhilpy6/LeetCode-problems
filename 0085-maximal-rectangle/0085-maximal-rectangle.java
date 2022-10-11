class Solution {
    public static int largestRectangleArea(int[] heights) {
      
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
  
    public int maximalRectangle(char[][] matrix) {
      int []height=new int[matrix[0].length];
      Arrays.fill(height,0);
      int max=0;
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
          if(matrix[i][j]=='1')height[j]++;
          else height[j]=0;         
          }
        int area=largestRectangleArea(height);
        System.out.println(area);
        max=Math.max(max,area);
      }
      return max;
    }
}