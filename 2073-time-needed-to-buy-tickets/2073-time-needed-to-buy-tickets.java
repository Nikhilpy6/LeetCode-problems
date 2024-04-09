class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
  /*    Approach 1(Using queue)
      
      
      int c=0;
      
      Queue<Integer> qu = new LinkedList<>();
       
      for(int i=0;i<tickets.length;i++){
        qu.add(i);
      }
      
      while(!qu.isEmpty()){
        int front = qu.poll();
        c++;
        tickets[front]--;
        
        if(front==k && tickets[front]==0){
          return c;
        }
        
        if(tickets[front]!=0){
          
          qu.add(front);
          
        }
        
      }
      return c; */
      
      
    /*  Approach 2 without usng QUeue
      
      int c=0;
      
      if(tickets[k]==1){
        return k+1;
      }
      
      while(tickets[k]>0){
        
        for(int i=0;i<tickets.length;i++){
          
          if(tickets[i]!=0){
            tickets[i]--;
            c++;
          }
          
          if(tickets[k]==0){
            return c;
          }
        }
        
      }
      return c;
    */  
      
      
      // Approach -3
      
      int time=0;
      
      for(int i=0;i<tickets.length;i++){
        if(i<=k){
          time+=Math.min(tickets[i],tickets[k]);
        }
        
        else{
          if(tickets[i]>=tickets[k]){
            time+=tickets[k]-1;
          }
          else{
            time+=tickets[i];
          }
        }
      }
      
      return time;
      
      
    }
}