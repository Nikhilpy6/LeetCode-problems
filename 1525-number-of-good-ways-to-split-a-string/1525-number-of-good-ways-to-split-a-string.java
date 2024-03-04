class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> mr =new HashMap<>();
      int ans=0;
    for(char c : s.toCharArray()){
        mr.put(c,mr.getOrDefault(c,0)+1);
      }
     HashMap<Character,Integer> ml = new HashMap<>();
      for(int i=0;i<s.length()-1;i++){
        char ch = s.charAt(i);
        if(mr.get(ch)>1)
          mr.put(ch,mr.get(ch)-1);
        else
          mr.remove(ch);
        
        ml.put(ch,ml.getOrDefault(ch,0)+1);
        if(mr.size()==ml.size())
          ans++;
      }
      return ans;
    }
}