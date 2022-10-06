class Solution {
    public int nextGreaterElement(int n) {
        String s=Integer.toString(n);
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
        nums[i]=(int)(s.charAt(i)-'0');
       // System.out.println(nums[i]);
      }
        if(nums.length<1)
          return -1;
      int j=nums.length-2;      
      while(j>=0 && nums[j]>=nums[j+1]){
            j--;
        }
       if(j<0)return -1;
      // System.out.println(j);
       int i=nums.length-1;
       while(nums[i]<=nums[j]){
                i--;
            }
      swap(i,j,nums);         
      reverse(j+1,nums);         
         int res = 0;
        for(int k=0;k<nums.length;k++) {
            if ((Integer.MAX_VALUE-nums[k])/10<res) return -1;
            res = res*10 + nums[k];
        }
        return res;
    
    }
      
    void reverse(int i,int nums[]){
            int st=i,end=nums.length-1;
            while(st<end){
                swap(st,end,nums);
                st++;
                end--;
            }
    }
   void swap(int i,int j,int nums[]){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
   
}