class Solution {
    public int maximum69Number (int num) {
        int dc=0;
      int rdc=-1;
      int temp=num;
      while(temp>0){
        int r=temp%10;
        if(r==6)rdc=dc;
        dc++;
        temp/=10;
      }
      if(rdc==-1)return num;
      int ans= num+3*(int)Math.pow(10,rdc);
      return ans;
    }
  
}