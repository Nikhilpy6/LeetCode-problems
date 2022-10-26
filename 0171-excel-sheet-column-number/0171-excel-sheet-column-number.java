class Solution {
    public int titleToNumber(String columnTitle) {
       if(columnTitle.length()==1)
          return (columnTitle.charAt(0)-'A'+1);
      int ans=0;
       for(int i=0;i<columnTitle.length();i++){
         ans*=26;
         ans+=(columnTitle.charAt(i)-'A'+1);
       }
      return ans;
    }
}