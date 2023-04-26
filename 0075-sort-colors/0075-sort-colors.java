class Solution {
    // private void swap(int a,int b,int nums){
    //   int t=nums[a];
    //   nums[a]=nums[b];
    //   nums[b]=t;
    // }
    public void sortColors(int[] nums) {
//         int a=0;
//         int b=0;
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//             int val=nums[i];
//             switch(val){
//                 case 0:
//                     a++;
//                     break;
//                 case 1:
//                     b++;
//                     break;
//                 case 2:
//                     c++;
//                     break;
//             }
            
//         }
//         int i=0;
//        while (a > 0) {
//             nums[i++] = 0;
//             a--;
//         }
//         while (b > 0) {
//             nums[i++] = 1;
//             b--;
//         }
//         while (c > 0) {
//             nums[i++] = 2;
//             c--;
//         }
        
//         for(i=0;i<nums.length;i++){
//             System.out.print(nums[i]);
//         }
      
      
      
      //Dutch National flag Algorithm
        
      int l=0,i=0,r=nums.length-1;
      while(i<=r){
        if(nums[i]==0){
          // swap(i,l,nums);
          int t=nums[i];
          nums[i]=nums[l];
          nums[l]=t;
            i++;
            l++;
        }
        else if(nums[i]==1)
          i+=1;
        
        else{
          // swap(i,r,nums);
          int d=nums[i];
          nums[i]=nums[r];
          nums[r]=d;
          r--;
        }
      }
    }
}