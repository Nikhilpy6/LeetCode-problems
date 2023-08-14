class Solution {
  
   void swap(int l,int j,int []nums){
     
     int t=nums[l];
     nums[l]=nums[j];
     nums[j]=t;
   }
  
  
  
    public int partitition(int l,int r,int []nums){
      int i=l+1;
      int j=r;
      int pivot=nums[l];
      
      while(i<=j){
        if(nums[i]<pivot && nums[j]>pivot){
          swap(i,j,nums);
          i++;
          j--;
        }
        if(nums[i]>=pivot)
          i++;
        
        if(nums[j]<=pivot)
          j--;
     }
      
      swap(l,j,nums);
      return j;
    }
  
  
  
  
    public int findKthLargest(int[] nums, int k) {
        //quick sort 
      int l=0;
      int r=nums.length-1;
      int pivot_idx=0;
      while(true){
        pivot_idx=partitition(l,r,nums);
        
        if(pivot_idx==k-1)break;
        
        if(pivot_idx<k-1){//2<3
          l=pivot_idx+1;
        }else{
          r=pivot_idx-1;
        
      }
    }
        return nums[pivot_idx];
    }
}