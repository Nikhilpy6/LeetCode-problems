class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
      //Approach 1
      
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
      return c;
    }
}