class Solution {
  int mod=(int)(1e9+7);
    private int rev(int num){
      int n=0;
    while(num!=0){
      int rem =num%10;
      n=(n*10)+rem;
      
      num/=10;
    }
      return n;
      
    }
  
    public int countNicePairs(int[] nums) {
      int ans=0;
      HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
          int n = nums[i]-rev(nums[i]);
         int result = hm.getOrDefault(n,0);
          ans = (ans+result)%mod;
          hm.put(n,result+1);
          
        }
      
     
      
      return ans;
    }
}