class Solution {
  
    public String[] findRelativeRanks(int[] score) {
      String ans[]=new String[score.length];
      PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)-> score[b]-score[a]);
      for(int i=0;i<score.length;i++){
        pq.add(i);
      }
      int idx=1;
     while(!pq.isEmpty()){
       int v=pq.poll();
       if(idx==1)
         ans[v]="Gold Medal";
       else if(idx==2)
         ans[v]="Silver Medal";
       else if(idx==3)
         ans[v]="Bronze Medal";
       else
         ans[v]=Integer.toString(idx);
       idx++;
     }
      return ans;
    }
}