class Solution {
    public int[] sortArrayByParity(int[] nums) {
       // int ans[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int temp;
        while(i<j){
            if(nums[i]%2!=0){
                 temp=nums[i];
                 nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
               
            else{
               i++;
            }
            
            
            
        }
        return nums;
        
    }
}