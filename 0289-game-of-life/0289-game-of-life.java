class Solution {
    private boolean isValid(int i,int j,int[][] board){
      if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 )
        return false;
      
      return board[i][j]==1 || board[i][j]==10;
      
    }
  
  
  
    private void adead(int[][] board,int i,int j){
      int dead = 0;
      
      if(isValid(i-1,j,board))dead++;
      if(isValid(i-1,j-1,board))dead++;
      if(isValid(i,j-1,board))dead++;
      if(isValid(i-1,j+1,board))dead++;
      if(isValid(i+1,j-1,board))dead++;
      if(isValid(i+1,j,board))dead++;
      if(isValid(i+1,j+1,board))dead++;
      if(isValid(i,j+1,board))dead++;
      
      if(dead==3)board[i][j]=11;
      
      
      
    }
  
    private void alive(int[][] board,int i,int j){
      int live = 0;
      
      if(isValid(i-1,j,board))live++;
      if(isValid(i-1,j-1,board))live++;
      if(isValid(i,j-1,board))live++;
      if(isValid(i-1,j+1,board))live++;
      if(isValid(i+1,j-1,board))live++;
      if(isValid(i+1,j,board))live++;
      if(isValid(i+1,j+1,board))live++;
      if(isValid(i,j+1,board))live++;
      
      if(live<2)board[i][j]=10;
      if(live>3)board[i][j]=10;
      
      
    }
    public void gameOfLife(int[][] board) {
        
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
          if(board[i][j]==1){
           alive(board,i,j);
          }
          else{// 1
            adead(board,i,j);
         }
          
        }
      }
      
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
          if(board[i][j]==10)
            board[i][j]=0;
        
         else if(board[i][j]==11)
           board[i][j]=1;
          }
       }
      
      
      
      
    }
}