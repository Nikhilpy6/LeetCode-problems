class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int ans[] =new int[deck.length];
        Arrays.sort(deck); // to get sorting order
        boolean skip = false;
        int i=0;  // for deck
        int j=0; // for ans
      
        while(i<deck.length){
          
          if(ans[j]==0){ //empty hai 
            
            if(skip==false){
              ans[j] = deck[i];
              i++;
              
              
            }
            skip = !skip;
          }
          j=(j+1)%deck.length;
          
        }
      return ans;
    }
}