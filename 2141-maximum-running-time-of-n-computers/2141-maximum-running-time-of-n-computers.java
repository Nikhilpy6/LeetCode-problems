class Solution {
  public boolean possibleBat(int[] batteries,long mid,int n){
    
    long target=mid*n;
    
    for(int i:batteries){
      target-=Math.min(mid,i);
      
      if(target<=0)
        return true;
      
      
    }
    
    
    return false;
  }
    
  
  
    public long maxRunTime(int n, int[] batteries) {
        long sum=0;
      for(int i:batteries){
        sum+=i;
      }
      
      long l=Arrays.stream(batteries).min().getAsInt();
      long r=sum/n;
      long res=0;
      
      while(l<=r){
       long mid=l+(r-l)/2;
        
        if(possibleBat(batteries,mid,n)){
          res=mid;
           l=mid+1;
          
        }
        else{
          
          r=mid-1;
         
        }
        
        
        
      }
      return res;
    }
}