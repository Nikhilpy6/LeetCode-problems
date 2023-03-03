class Solution {
    private void bcktrck(List<List<Integer>>ans,List<Integer> res,int []nums ,int ind){
      
      
      ans.add(new ArrayList(res));
      
      
      for(int i=ind;i<nums.length;i++){
        if(i>ind&&nums[i]==nums[i-1]) continue; // to avoid duplicates
        res.add(nums[i]);
        bcktrck(ans,res,nums,i+1);
        res.remove(res.size()-1);
      }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(nums);
        bcktrck(ans,new ArrayList<>(),nums,0);
      return ans;
    }
}

     