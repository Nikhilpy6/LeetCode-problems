class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //int st=0;
      int ans[]=new int[nums.length];
    /*  for(int i=0;i<nums.length;i++){
        int cnt=0;
        for(int j=0;j<nums.length;j++){
          if(nums[i]>nums[j] && i!=j)
            cnt++;
        }
        ans[i]=cnt;
      }
      return ans;*/
      
      HashMap<Integer,Integer> hm =new HashMap<>();
      int copyarr[]=nums.clone();
      Arrays.sort(copyarr);
      for(int i=0;i<nums.length;i++){
        hm.putIfAbsent(copyarr[i],i);
      }
      
      for(int i=0;i<nums.length;i++){
        ans[i]=hm.get(nums[i]);
      }
     return ans;
    }
}