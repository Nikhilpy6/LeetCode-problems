class Solution {
    public int numberOfSubstrings(String s) {
        int[] chrs = new int[3];
        int ans =0;
        int l =0;
        
        for(int i=0; i<s.length();i++)
        {
            chrs[s.charAt(i) - 'a']++;
            
            while(chrs[1] > 0 && chrs[2] > 0 && chrs[0] > 0)
            {
                ans += s.length()-i;
                chrs[s.charAt(l++) - 'a']--;
            }
        }
        return ans;
    }
}