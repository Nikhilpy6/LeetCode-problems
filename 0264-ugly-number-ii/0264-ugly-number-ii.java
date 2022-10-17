class Solution {
    public int nthUglyNumber(int n) {
      /*
      //implementation using dynamic programmin
      
      
      int dp[]=new int[n];
      dp[0]=1;
      int p1=0;  //pointers
      int p2=0;
      int p3=0;
      for(int i=1;i<n;i+=1){
        int mul2=dp[p1]*2;  //2*1=2
        int mul3=dp[p2]*3; //3*1=3
        int mul5=dp[p3]*5; //5*1=5
         
        dp[i]=Math.min(mul2,Math.min(mul3,mul5));  
        
        //dp[]= [1,2,3,4,5,6,8......dp[n-1]]
        //p1+=1
        //min(2*4,3*3,5*1)==>3
        //now p2+=1
        
        if(dp[i]==mul2)p1++;
        if(dp[i]==mul3)p2++;
        if(dp[i]==mul5)p3++;
      }
      return dp[n-1];
      */
      PriorityQueue<Long> pq= new PriorityQueue<>();
      pq.add(1l);
      int an=n-1;
      while(an>0){
        Long a=pq.poll();
        if(!pq.contains(a*2))
          pq.add(a*2);
        if(!pq.contains(a*3))
          pq.add(a*3);
        if(!pq.contains(a*5))
          pq.add(a*5);
        an--;
      }
      long ans=pq.poll();
      return (int)ans;
    }
}