class Solution {
     class Seed{
      int plant;
      int grow;
      
      Seed(int p, int g){
        this.plant=p;
        this.grow=g;
      }
    }  
  
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        List<Seed> list =new ArrayList<>();
       for(int i=0;i<plantTime.length;i++){
         list.add(new Seed(plantTime[i],growTime[i]));
       }
      Collections.sort(list, (a,b)-> (b.grow-a.grow));
      int time =0;
      int max=0;
      
      for(int i=0;i<plantTime.length;i++){
        time+=list.get(i).plant;
        max=Math.max(max,time+list.get(i).grow);
      }
      return max;
    }
}