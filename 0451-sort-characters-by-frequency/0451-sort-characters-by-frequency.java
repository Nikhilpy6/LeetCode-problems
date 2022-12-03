class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> mp = new HashMap<>();
      
      
      for(int i=0;i<s.length();i++){
        mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
      }
      
      PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq-a.freq);
      for(Map.Entry<Character,Integer> entry: mp.entrySet()) {
            Pair pair = new Pair(entry.getKey(),entry.getValue());
            pq.add(pair);
        }
      
      StringBuilder sb = new StringBuilder();
      while(!pq.isEmpty()) {
            Pair pair = pq.remove();
            int count = pair.freq;
            char c = pair.ch;
            // add character into answer string as many time as frequency (it appears in main string)
            while(count--> 0) {
                sb.append(c);
            }
        }
        return sb.toString();
      
    }
    
}
class Pair{
   char ch;
   int freq;
  
  Pair(char ch,int freq){
    this.ch=ch;
    this.freq=freq;
  }
  
 
}