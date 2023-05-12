class Solution {
  class Pair{
    int f,s;
    Pair(int f,int s){
      this.f=f;
      this.s=s;
    }
  }
    public int shortestPathBinaryMatrix(int[][] grid) {
      int n=grid.length;
     
      if(grid[0][0]!=0 || grid[n-1][n-1]!=0)return -1;
      if(n-1==0)return 1;
      Queue<Pair> qu =new LinkedList<>();
      qu.offer(new Pair(0,0));
      grid[0][0]=1;
      int level=0;
      int dr[] = {0, -1, -1, -1, 0, 1, 1, 1};
      int[] dc = {-1, -1, 0, 1, 1, 1, 0, -1};
      
      while(!qu.isEmpty()){
        int s=qu.size();
        while(s-- >0){
          Pair p = qu.poll();
          int fi=p.f;
          int se=p.s;
          
          if(fi==n-1 && se==n-1)
            return level+1;
          for(int i=0;i<8;i++){
            int f1=fi+dr[i];
            int s2=se+dc[i];
          
            if(f1>=0 && f1<n && s2>=0 && s2<n && grid[f1][s2]==0){
              qu.add(new Pair(f1,s2));
              grid[f1][s2]=1;
            }
          }
        }
        
        level++;
      }
      return -1;
      
    }
}



/*

Dijkstra Algorithm

class pair{
    int first,second,third;
    pair(int first,int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0){
            return -1;
        }
        if(n-1==0)return 1;
        Queue<pair> q =new LinkedList<>();
        int dis[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        dis[0][0]=0;
        q.add(new pair(0,0,0));
        int dr[] = {0, -1, -1, -1, 0, 1, 1, 1};
        int[] dc = {-1, -1, 0, 1, 1, 1, 0, -1};
        while(!q.isEmpty()){
            pair p=q.peek();
            q.poll();
            int k=p.first;
            int y=p.second;
            int z=p.third;
            for(int i=0;i<8;i++)
            {
                int nr=y+dr[i];
                int nc=z+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0 && k+1<dis[nr][nc]){
                    dis[nr][nc]=k+1;
                    if(nr==n-1 && nc==n-1){
                        return k+2;
                    }
                    q.add(new pair(k+1,nr,nc));
                }
            }
        }
        return -1;     
    }
}*/