class Solution {
    public int largestVariance(String s) {
        int freq[]=new int[26];
      for(char ch:s.toCharArray()){
        freq[ch-'a']++;
      }
      int ans=0;
      for(int i=0;i<26;i++){
        for(int j=0;j<26;j++){
          if(i==j || freq[i]==0 || freq[j]==0)
            continue;
          char major=(char)(i+'a');
          char minor=(char)(j+'a');
          
          int fir=0;
          int sec=0;
          boolean pastsec=false;
          for(char c:s.toCharArray()){
            if(c==major)
              fir++;
            
            if(c==minor)
              sec++;
            
            if(sec>0){
              ans=Math.max(ans,fir-sec);
              pastsec=false;
            }
            if(pastsec==true){
              
              ans=Math.max(ans,fir-1);
              // pastsec=false;
            }
            
            if(sec>fir){
              
              fir=0;
              sec=0;
              pastsec=true;
            }
            
            
            
            
          }
          
          
        }
      }
      
      
      
      
      
      return ans;
    }
}