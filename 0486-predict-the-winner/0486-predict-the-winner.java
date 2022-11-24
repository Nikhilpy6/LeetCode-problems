class Solution {
   public static boolean recursion(int []nums, boolean a_turn, int score_a, int score_b,int i,int j){
     if(i>j)
        return score_a>=score_b;
      
    if(a_turn==true)
        return recursion(nums,false,score_a+nums[i],score_b,i+1,j)||recursion(nums,false,score_a+nums[j],score_b,i,j-1);
        
    
         return recursion(nums,true,score_a,score_b+nums[i],i+1,j)&&recursion(nums,true,score_a,score_b+nums[j],i,j-1);
   }
    public boolean PredictTheWinner(int[] nums) {
        return  recursion(nums,true,0,0,0,nums.length-1);
    }
}