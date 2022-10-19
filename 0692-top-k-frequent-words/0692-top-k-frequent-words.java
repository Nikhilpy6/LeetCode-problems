class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         Map<String, Integer> map = new HashMap<>();
        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) ->{
          if(a.getValue() == b.getValue())
                 return a.getKey().compareTo(b.getKey());
          return b.getValue() - a.getValue();
                                                                      });
        List<String> ans = new ArrayList<>();
        
        for(String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);
        
        for(Map.Entry<String, Integer> e : map.entrySet())
            queue.add(e);
        
        while(k-- > 0)
            ans.add(queue.remove().getKey());
        
        return ans;
    }
}