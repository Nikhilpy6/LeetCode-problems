class Solution {
    int t[][];
    int n;
    public int solve(int idx,int[][] events, int k){
      if(idx>=n || k==0){
        return 0;
      }
      
      if(t[idx][k]!=-1)return t[idx][k];
      
      int skip=solve(idx+1,events,k);  //skip
      
      int j=idx+1;
      int last=n;
      // for(;j<n;j++){
      //   if(events[j][0] > events[idx][1])
      //     break;
      // }
      
      //binary search
        while(j<last){
          int mid=(j+last)/2;
          
          if(events[mid][0]>events[idx][1]){
            last=mid;
          }
          else
            j=mid+1;
          
        }
      int take =  events[idx][2] + solve(j,events,k-1);
      
      return t[idx][k]=Math.max(skip,take);
      
    }
  
  
  
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events,(a,b)-> a[0]-b[0]);
      n=events.length;
      // for(int i=0;i<n;i++){
      //   System.out.println(events[i][0]+ ","+ events[i][1]);
      // }
      
      // return n;
      t=new int[n+1][k+1];
      for(int i=0;i<=n;i++){
        Arrays.fill(t[i],-1);
      }
      return solve(0,events,k);
    }
}