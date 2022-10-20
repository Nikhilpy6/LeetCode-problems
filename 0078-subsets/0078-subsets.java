class Solution {
    public void outcomes( List<List<Integer>>ans , int[] nums,List<Integer>ar,int s){
      
      ans.add(new ArrayList<>(ar));
      for(int i=s;i<nums.length;i++){
        ar.add(nums[i]);
        outcomes(ans,nums,ar,i+1);
        ar.remove(ar.size()-1);
      }
      
    }
  
  
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        outcomes(ans,nums,new ArrayList<>(),0);
      return ans;
    }
}