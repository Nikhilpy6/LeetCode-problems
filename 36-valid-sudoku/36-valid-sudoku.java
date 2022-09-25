class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<String> s=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];
                if(val != '.')
                    if(!s.add(val+"row"+i) || !s.add(val+"col"+j) || !s.add(val+"box"+i/3+"-"+j/3)) 
                      return false;
                
                
            }
        }
        return true;
    }
}