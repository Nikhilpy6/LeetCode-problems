class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int res[]=new int[nums.length];
      int even_sum=0;
       for(int a: nums){
         if(a%2==0)
           even_sum+=a;
       }
      int ans[]=new int[queries.length];
      for(int i=0;i<queries.length;i++){
        int val=queries[i][0];
        int indx=queries[i][1];
        
        if(nums[indx]%2==0){
          even_sum-=nums[indx];
        }
        nums[indx]+=val;
        if(nums[indx]%2==0){
          even_sum+=nums[indx];
        }
        ans[i]=even_sum;
      }
      return ans;
    }
}