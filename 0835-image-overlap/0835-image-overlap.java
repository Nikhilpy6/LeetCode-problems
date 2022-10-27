class Solution {
    /* private int shift_count(int[][] A, int[][] B){
        int n = A.length, count = 0;
        for(int x = 0; x < n; ++x){
            for(int y = 0; y < n; ++y){
                int temp = 0;
                for(int i = y; i < n; ++i){
                    for(int j = x; j < n; ++j)
                        if(A[i][j] == 1 && B[i-y][j-x] == 1) temp++;
                }
                count = Math.max(count, temp);
            }
        }
        return count;
    }
    public int largestOverlap(int[][] A, int[][] B) {
        return Math.max(shift_count(A, B), shift_count(B, A));
    }
}*/
   public int largestOverlap(int[][] img1, int[][] img2) {
      int res = 0;
      int N = img1.length;
      var count = new int[N * 2][N * 2]; 
      for(int i = 0; i < N; i ++) {
          for(int j = 0; j < N; j ++) {
              if(img1[i][j] == 0) continue;

              for(int m = 0; m < N; m ++) {
                  for(int n = 0; n < N; n ++) {
                      if(img2[m][n] == 0) continue;
                      res = Math.max(res, ++ count[N + i - m][N + j - n]);
                  }
              }
          }
      }
      return res; 
   }
}