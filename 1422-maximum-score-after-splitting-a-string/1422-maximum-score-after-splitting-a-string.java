class Solution {
    public int maxScore(String s) {
        int one=0;
    
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1')
          one++;
      }
      int zero=0,max=Integer.MIN_VALUE;
      for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i) =='0')
          zero+=1;
        
        else
          one-=1;
        
        max = Math.max(one+zero,max);
        }
      return max;
    }
}