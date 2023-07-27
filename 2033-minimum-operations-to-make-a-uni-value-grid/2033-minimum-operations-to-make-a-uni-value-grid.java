class Solution {
    public int minOperations(int[][] grid, int x) {
      int n=grid.length;
      int m=grid[0].length;
      int arr[]=new int[m*n];
      int k=0;
     for(int i = 0; i < n; i++)
        for(int j = 0; j < m; j++){
            arr[k] = grid[i][j];
            k++;
        }
    int sum=0;
     Arrays.sort(arr);
      int s=arr.length;
      int t=arr[s/2];
      for(int i=0;i<s;i++){
        if(arr[i]==t)continue;
        
        int diff=Math.abs(arr[i]-t);
        // int diff=arr[s-i-1]-arr[i]; when only increament is allowed
        if(diff%x!=0)return -1;
        
        sum+=(diff/x);
        
        
      }
      return sum;
    }
}