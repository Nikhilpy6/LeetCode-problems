class Solution {
    public int minimumAverageDifference(int[] nums) {
      long sum=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          //System.out.println(nums[i]);
        }
      
      int min=Integer.MAX_VALUE;
      int n=nums.length;
      int ind=0;
      long csum=0;
      for(int i=0;i<nums.length;i++){
        csum+=nums[i];
        long val=csum/(i+1);
       //System.out.println(val);
        long val2=(sum-csum)/((n-i-1)>0 ? (n-i-1) : 1);
        long ans=Math.abs(val-val2);
        //System.out.println(ans+"*");  
        if((int)ans<min){
          min=(int)ans;
          ind=i;
          
        }
      }
      return ind;
    }
}