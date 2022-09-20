class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> se= new HashSet<>();
       for(int i=0;i<nums.length;i++){
         se.add(nums[i]);
       }
     if(se.size()<nums.length)
       return true;
     else
       return false;
      
    }
}