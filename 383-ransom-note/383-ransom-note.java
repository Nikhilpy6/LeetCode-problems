class Solution {
    public boolean canConstruct(String ransomNote, String magzine) {
        if(ransomNote.length()>magzine.length())return false;
        HashMap<Character,Integer> map =new HashMap<>();
      for(int i=0;i<magzine.length();i++){
        char a=magzine.charAt(i);
        map.put(a,map.getOrDefault(a,0)+1);
      }
      for(int i=0;i<ransomNote.length();i++){
        char b=ransomNote.charAt(i);
        if(!map.containsKey(b))
          return false;
        // else if(map.get(b)==0)
        //   map.remove(b);
        else{
          map.put(b,map.get(b)-1);
          if(map.get(b)==0)
            map.remove(b);
        }
        
      }
      return true;
    }
}