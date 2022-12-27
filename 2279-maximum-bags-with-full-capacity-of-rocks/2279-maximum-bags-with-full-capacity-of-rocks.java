class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
      int c[]=new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
          capacity[i]-=rocks[i];
        }
      int ans=0;
      
      Arrays.sort(capacity);
      
      for(int i=0;i<capacity.length;i++){
        if(additionalRocks<=0)break;
        //else if(capacity[i]==0)ans++;
        else if(additionalRocks>=capacity[i]){
          additionalRocks-=capacity[i];
          ans++;
        }
      }
      return ans;
    }
}