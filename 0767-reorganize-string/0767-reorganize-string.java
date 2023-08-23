
  class Solution {
    public String reorganizeString(String s) {
      int n=s.length();
      HashMap<Character,Integer> hm =new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        hm.put(c,hm.getOrDefault(c,0)+1);
        if(hm.get(c)>((n+1)/2))return "";
      }
      PriorityQueue<Character> pq =new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
      pq.addAll(hm.keySet());
      
     
      String ans="";
      while(pq.size()>1){
        char c1=pq.poll();
        char c2=pq.poll();
        
        ans+=c1;
        ans+=c2;
        hm.put(c1,hm.get(c1)-1);
        
        hm.put(c2,hm.get(c2)-1);
        
        if(hm.get(c1)>0)pq.add(c1);
        if(hm.get(c2)>0)pq.add(c2);
        
      }
      
      if (!pq.isEmpty()) {
            char ch = pq.poll();
            //if (hm.get(ch) > 1) return "";
            ans+=ch;
        }
      return ans;
    }
}

