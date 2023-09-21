class Solution {
  int m,n;
  int dir[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public char[][] updateBoard(char[][] board, int[] click) {
      m=board.length;
      n=board[0].length;
        int r = click[0];
        int c = click[1];
      if(board[r][c]=='M'){
        board[r][c]='X';
          return board;
      }
      
        int mines = countMines(click,board);
        //if(mines==0)board[r][c]='B';
        if(mines>0){
          board[r][c]=(char)(mines+'0');
        }
        else{
        board[r][c]='B';
        List<List<Integer>> unrevealed = getUnrevealed(click,board);
        for(List<Integer> val: unrevealed){
          updateBoard(board,new int[]{val.get(0),val.get(1)});
          }
        }
       
      
      
      return board;
    }
  
  public int countMines(int[] click,char[][] board){
    int mines=0;
    for(int []d:dir){
      int i=click[0]+d[0],j=click[1]+d[1];
      if(i!=-1 && i!=m && j!=-1 && j!=n && board[i][j]=='M')mines++;
    }
    return mines;
  }
  
 public List<List<Integer>> getUnrevealed(int[] click , char[][] board){
   
    List<List<Integer>> list =new ArrayList<>();
   List<Integer> t;
    for(int []d:dir){
      int i=click[0]+d[0],j=click[1]+d[1];
      if(i!=-1 && i!=m && j!=-1 && j!=n && (board[i][j]=='M' || board[i][j]=='E')){
        t = new ArrayList<>();
        t.add(i);
        t.add(j);
        list.add(t);
      }
    }
    return list;
  }
  
  
}