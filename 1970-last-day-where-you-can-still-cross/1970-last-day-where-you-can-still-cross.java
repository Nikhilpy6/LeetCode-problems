class Solution {
  public int[][] nthDayBoard(int[][] cells,int n,int row,int col){
     int[][] board = new int[row][col];
        for(int i = 0 ; i < n ; i++){
            board[cells[i][0]-1][cells[i][1]-1] = 1;
        }
        return board;
    }


    public boolean bfs(int[][] board, int row, int col){
        int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        for(int j = 0 ; j < col ; j++){
            if(board[0][j] == 0){
                q.add(new int[]{0, j});
                board[0][j] = 1;
            }
        }

        while(!q.isEmpty()){
            int[] rm = q.poll();
            if(rm[0] == row-1) return true;
            for(int[] ar : dir){
                int nr = rm[0]+ar[0];
                int nc = rm[1]+ar[1];
                if(nr < 0 || nr == row || nc < 0 || nc == col || board[nr][nc] == 1) continue;
                q.add(new int[]{nr, nc});
                board[nr][nc] = 1;
            }
        }
        return false;
    }




    public int latestDayToCross(int row, int col, int[][] cells) {
        int lo = 0;
        int hi = cells.length-1;
        int day = 0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            int[][] board = nthDayBoard(cells, mid, row, col);

            /* bfs approach*/
             if(bfs(board, row, col)){
                 day = mid;
                 lo = mid+1;
             }else{
                 hi = mid-1;
            }

        }
        return day;
    }
}