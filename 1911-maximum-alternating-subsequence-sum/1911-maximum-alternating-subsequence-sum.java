class Solution {
    long t[][];
    long solve(int i,int op,int []nums){
      if(i==nums.length)return 0;
      
      if(t[i][op]!=-1)return t[i][op];
      
      long take = 0; 
      
        if(op==1){
          take = nums[i]*(-1) + solve(i+1,0,nums);
        }
        else  //0
        {
          take =nums[i] + solve(i+1,1,nums);
        }
      
      long n_take = solve(i+1,op,nums);
      
      return t[i][op] = Math.max(take,n_take);
    }
    public long maxAlternatingSum(int[] nums) {
        //two call 1-taking that element
        //         2-not taking
      t=new long[100001][2];
      for(int i=0;i<100001;i++){
        Arrays.fill(t[i],-1);
      }
      return solve(0,0,nums);
      
      
    }
}