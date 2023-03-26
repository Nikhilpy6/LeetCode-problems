class Solution {
    public int totalSteps(int[] nums) {
      Stack<Pair<Integer,Integer>> st =new Stack<>();
      int n=nums.length;
      int max=0;
      st.add(new Pair(nums[n-1],0));
      for(int i=n-2;i>=0;i--){
          int cnt=0;
          while(!st.isEmpty() && st.peek().getKey()<nums[i]){
            cnt=Math.max(cnt+1,st.peek().getValue());
            st.pop();
          }
          
          max=Math.max(max,cnt);
          st.add(new Pair(nums[i],cnt));
        
        
      }
      return max;
    }
}