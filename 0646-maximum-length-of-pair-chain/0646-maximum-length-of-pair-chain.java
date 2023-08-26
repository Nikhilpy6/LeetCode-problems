class Solution {
   public int findLongestChain(int[][] pairs, int position, int prev){
        if(position==pairs.length){
            return 0;
        }
        if(prev>=pairs[position][0]){
            return findLongestChain(pairs, position+1, prev); 
        }
        return 1+findLongestChain(pairs, position+1, pairs[position][1]);
        
    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        return findLongestChain(pairs, 0, Integer.MIN_VALUE);
        
    }
}