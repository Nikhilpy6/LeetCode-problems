class Solution {
   public long SumDiMid(int[] candies,int mid){
    long s=0;
     for(int i:candies){
       s += i/mid;
     }
     // System.out.println(s);
     return s;
     
     
   }
  
  
  
  
    public int maximumCandies(int[] candies, long k) {
        int i=1;
      int max=0;
        int j =Arrays.stream(candies).max().getAsInt();
       while(i<=j){
          int mid=i+(j-i)/2;
         
         if(SumDiMid(candies,mid)>=k){
           i=mid+1;
           max=Math.max(max,mid);
           
         }
         else
           j=mid-1;
           
        }
      return max;
      
    }
}