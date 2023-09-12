class Solution {
    public int minDeletions(String s) {
        int ar[] = new int[26];
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        int val = (ch-'a');
        ar[val]++;
      }
      
      HashSet<Integer> set = new HashSet();
      int ans=0;
      for(int i=0;i<26;i++){
        
        while(ar[i]>0 && set.contains(ar[i])){
          
          ar[i]-=1;
          ans++;
          
        }
        set.add(ar[i]);
      }
      
      return ans;
      
    }
}