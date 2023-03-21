class Solution {
    public int removeDuplicates(int[] nums) {
      //boolean flag=false;
      int cnt=1;
      int ref=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
          if(nums[i]==nums[i-1] || nums[i]==ref)
          {
            cnt++;            
          }
          else{
            //System.out.println(nums[i]+"# ");
            cnt=1;
          }
         // System.out.println(i+"*"+cnt+"*");
          
          if(cnt>2)
          {
            
            ref=nums[i];
           // System.out.println(cnt+ "*  " +ref+"*");
            nums[i]=Integer.MAX_VALUE;
          }
          
          
          
        }
      int ans=0;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=Integer.MAX_VALUE)
          ans++;
      }
      return ans;
    }
}