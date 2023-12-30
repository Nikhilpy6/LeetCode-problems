class Solution {
    public int minOperations(String s) {
       
        int cnt_1=0;
        int cnt_0=0;
      
      for(int i=0;i<s.length();i++){
        if(i%2==0){//101010....
          if(s.charAt(i)=='0'){
            cnt_1++;
          }
          else{
            cnt_0++;
          }
         
        }
        if(i%2!=0){//0101010....
          if(s.charAt(i)=='0'){
            cnt_0++;
          }
         else
           cnt_1++;
        }
      }
      return Math.min(cnt_1,cnt_0);
    }
}
   