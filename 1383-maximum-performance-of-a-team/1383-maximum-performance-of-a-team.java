class Solution {  
   
  //construct a class for pairing speed,efficiency..........
  
    private class Engineer{
       private int speed;
       private int efficiency;
      
       public Engineer(int speed, int efficiency){
         this.speed=speed;
         this.efficiency=efficiency;
       }
    }
  
  
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
      
      // create a list of class Engineer which contains the speed and efficiency...............
      
      List<Engineer> pairs =new ArrayList<>();
      for(int i=0;i<speed.length;i++){
        pairs.add(new Engineer(speed[i],efficiency[i]));
      }
       // sort the list on the basis of efficiency in descending order......
      
      pairs.sort((a,b)-> b.efficiency-a.efficiency);
 //create PQ for mplementing min heap on the sorting basis of speed internally      
        PriorityQueue<Engineer> pq = new PriorityQueue<>((a,b) -> a.speed-b.speed);
        long teamspeed=0;
        long maxperf=0;
      
      for(Engineer values : pairs){  
        if(pq.size()==k){           //here we check if size is equal to k the decrease the size of PQ
          
          Engineer time=pq.poll();
          teamspeed-=time.speed;
        }
         //here adding data in PQ
        pq.add(values);
        teamspeed+=values.speed;
        
        //taking maximum performance of the team
        long perform=teamspeed * (long)values.efficiency;
        maxperf=Math.max(maxperf,perform);
      }
      
      return (int)(maxperf % 1000000007);
      
      
    }
}