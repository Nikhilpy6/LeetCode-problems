class Solution {
    private int binarySearch(int []potions,int find,long success){
      int l=0,h=potions.length-1;
      while(l<=h){
        int mid= l + (h - l) /2;
        if((long)potions[mid]*find>=success)
          h=mid-1;
        else
          l=mid+1;
      }
      return l;
    }
  
  
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      Arrays.sort(potions);
      int []ans= new int[spells.length];
      
      for(int i=0;i<spells.length;i++){
        int ind=binarySearch(potions,spells[i],success);
        ans[i]=potions.length-ind;
      }
      return ans;
    }
}