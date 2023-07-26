class Solution {
   boolean possibleEat(int[] piles,int mid,int h){
      int res=0;
      for(int i:piles){
        
        res+=i/mid;
        if(i%mid!=0){
          res++;
        }
      }
      // System.out.println(res);
     return res<=h;
      
    }
  
  
    public int minEatingSpeed(int[] piles, int h) {
      
        int i=1;
        int j=Arrays.stream(piles).max().getAsInt();
      while(i<j){
        int mid=i+(j-i)/2;
        
        if(possibleEat(piles,mid,h)){
          
          j=mid;
         
        }
        else
          i=mid+1;
        
        
        
        
      }
      return i;
    }
}