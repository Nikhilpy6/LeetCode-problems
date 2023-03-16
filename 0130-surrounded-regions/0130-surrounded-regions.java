class Solution {
  void dfs(int i,int j,int m,int n,char [][]board){
    if(i<0 || j<0 || i==m ||j==n || board[i][j]!='O')
      return;
    board[i][j]='@';
    dfs(i+1,j,m,n,board);
    dfs(i-1,j,m,n,board);
    dfs(i,j+1,m,n,board);
    dfs(i,j-1,m,n,board);
  }
    public void solve(char[][] board) {
      int m=board.length;
      int n=board[0].length;
        // traverse 1st and last col
        for (int i = 0; i < m; i++){
            dfs(i, 0,m,n,board);
            dfs(i, n - 1,m,n,board);
        }

        // traverse 1st and last row
        for (int j = 0; j < n; j++){
            dfs(0, j,m,n,board);
            dfs(m - 1, j,m,n,board);
        }
       for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
             if(board[i][j]=='O')
               board[i][j]='X';
            
            if(board[i][j]=='@')
                board[i][j]='O';
          }
        
       }
      
    }
}