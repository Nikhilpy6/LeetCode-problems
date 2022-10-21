class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
        }
      Set<Character> se = new HashSet<>();
      for(int i=0;i<s.length();i++){
        se.add(s.charAt(i));
      }
      int v=0;
      boolean odd=false;
      for(char c:se){
        if(map.get(c)%2==0){
          v+=map.get(c);
        }
        else{
          odd=true;
          v+=map.get(c)-1;
        }
      }
      if(odd==true)
        return v+1;
      return v;
     
    }
}