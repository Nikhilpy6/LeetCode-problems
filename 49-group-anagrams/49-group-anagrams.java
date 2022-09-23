class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      //hashMap which stores the hashmap as a key and a string list as a value
        HashMap<HashMap<Character,Integer>,List<String>> map= new HashMap<>();
      
      
      for(String s:strs){
        
        // hashmap for counting the frequency of 1st string
        
        HashMap<Character,Integer> fmp= new HashMap<>();
        for(int i=0;i<s.length();i++){
          char a=s.charAt(i);
          fmp.put(a,fmp.getOrDefault(a,0)+1);
        }
        
        //if the main map has no fmp as a key then add the key value to the main map
        
        if(map.containsKey(fmp)==false){
          ArrayList<String> list=new ArrayList<>();
          list.add(s);
          map.put(fmp,list);  ///adding fmap into main map
        }
        
        //if fmap already exist in main map just add the new strin to the existing list
        else{
          List<String> list = map.get(fmp);
          list.add(s);
        }
      }
      
      //return the list of list here by fetching the values from the main map
      List<List<String>> ans= new ArrayList<>();
      for(List<String>val:map.values()){
        ans.add(val);
      }
      return ans;
    }
}