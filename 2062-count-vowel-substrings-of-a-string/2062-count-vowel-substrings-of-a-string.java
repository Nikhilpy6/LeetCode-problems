class Solution {
    public int countVowelSubstrings(String word) {
      int ans=0;
      HashSet<Character> set = new HashSet<>();
      
      
      
      for(int i=0;i<word.length()-4;i++){
        set.clear();
        for(int j=i;j<word.length();j++){
          char ch = word.charAt(j);
          
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            set.add(ch);
            if(set.size()==5)ans++;
          }
          else
            break;
          
          
        }
        
        
      }
      return ans;
        
      
    }
}