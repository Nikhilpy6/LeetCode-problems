class Solution {
    public String getHint(String secret, String guess) {
      Map<Character ,Integer> map = new HashMap<>();
      Map<Character ,Integer> map2 = new HashMap<>();
     
      int  bulls=0;
      int cow=0;
        for(int i=0;i<secret.length();i++){
          char c=secret.charAt(i);
          char ch=guess.charAt(i);
          if(c==ch){
             bulls++;
            }
          else {
            map.put(c , map.getOrDefault(c,0)+1);
          map2.put(ch , map2.getOrDefault(ch,0)+1);
            
          }
        
        }
       for(char c: map.keySet()){
         if(map2.containsKey(c)){
         cow+=Math.min(map.get(c),map2.get(c));
         }
       }
      
      return Integer.toString(bulls)+'A'+Integer.toString(cow)+'B';
    }
}