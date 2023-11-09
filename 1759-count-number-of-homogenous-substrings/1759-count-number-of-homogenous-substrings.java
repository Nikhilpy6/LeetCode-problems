class Solution {
    int mod =(int)(1e9+7);
    public int countHomogenous(String s) {
      int ans=1;
      int cnt=1;
        for(int i=1;i<s.length();i++){
          
          if(s.charAt(i)==s.charAt(i-1)){
            cnt++;
          }else{
            cnt=1;
          }
          ans=(ans+cnt)%mod;
          
          
        }
      return ans;
    }
}