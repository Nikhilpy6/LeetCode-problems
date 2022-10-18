class Solution {
    public boolean isIsomorphic(String s, String t) {
      if(s.length()!=t.length())return false;
        HashMap<Character,Character> map= new HashMap<>();
        HashMap<Character,Boolean> map1= new HashMap<>();
        for(int i=0;i<s.length();i++){
          char c1=s.charAt(i);
          char c2=t.charAt(i);
          // 2 amp using :-
          // 1 for 1 to 1 ampping
          // boolean for checking not already mapped
          
          if(map.containsKey(c1)){
            if(map.get(c1)!=c2)
              return false;
            
          }
          else{
            if(map1.containsKey(c2)==true){
              return false;
            }
            else{
              map.put(c1,c2);
              map1.put(c2,true);
            }
          }
        }
      return true;
    }
}