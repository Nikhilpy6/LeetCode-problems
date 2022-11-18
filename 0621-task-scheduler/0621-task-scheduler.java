class Solution {
    public int leastInterval(char[] tasks, int n) {
      if(n==0)
        return tasks.length;

      int freq[]=new int[26];
      for(char c:tasks){
        freq[c-'A']++;
      }
       Arrays.sort(freq);
      int max=freq[25]-1;
      int idle_slot=max*n;
      for(int i=24;i>=0;i--){
        idle_slot-=Math.min(freq[i],max);
      }
      return idle_slot > 0? tasks.length+idle_slot : tasks.length;
    }
}