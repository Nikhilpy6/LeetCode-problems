class Solution {
    public int minSteps(String s, String t) {
        int []ap = new int[26];
        int []alp= new int[26];
      
      for(char c:s.toCharArray()){
        ap[c-'a']++;
      }
      for(char c:t.toCharArray()){
        alp[c-'a']++;
      }
      int ans=0;
      for(int i=0;i<26;i++)
      {
        if(alp[i]!=ap[i])ans+=Math.abs(alp[i]-ap[i]);
      }
      
      return ans;
    }
}