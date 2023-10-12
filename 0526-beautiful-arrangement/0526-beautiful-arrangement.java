class Solution {
    int cnt=0;
    public void solve(boolean[] vis,int pos,int n){
      if(pos>n)cnt++;
      
      for(int i=1;i<=n;i++){
      if(!vis[i] && (pos%i==0 || i%pos==0)){
        vis[i]=true;
        solve(vis,pos+1,n);
        vis[i]=false;
        }
      }
    }
  
  
    public int countArrangement(int n) {
        boolean vis[] = new boolean[n+1];
      solve(vis,1,n);
      return cnt;
    }
}