class Solution {
    public int maxProfit(int[] prices) {
      int p1=0,p2=0,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
      for(int i:prices){
         min1 = Math.min(min1,i);
         p1 = Math.max(p1,i-min1);
                        
         min2 = Math.min(min2,i-p1);
         p2 = Math.max(p2,i-min2);
      }
      return p2;
    }
}
