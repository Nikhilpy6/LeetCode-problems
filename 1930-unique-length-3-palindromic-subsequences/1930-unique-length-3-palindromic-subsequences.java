class Solution {
    public int countPalindromicSubsequence(String s) {
      
      
      int res=0;
      
      HashSet<Character> set = new HashSet<>();
      for(char ch:s.toCharArray()){
        set.add(ch);
        
      }
      
      for(char ch:set){
        int left=-1;
        int right=-1;
        for(int i=0;i<s.length();i++){
          
          if(ch==s.charAt(i)){
           if(left==-1){
             left=i;
           } 
          right =i;
          }
        }
        System.out.println(left+"&"+right);
        
        HashSet<Character> idx = new HashSet<>();
        for(int st=left+1;st<=right-1;st++){
          idx.add(s.charAt(st));
          // System.out.println(s.charAt(st)+"&");
        }
        res+=idx.size();
      }
      return res;
    }
}