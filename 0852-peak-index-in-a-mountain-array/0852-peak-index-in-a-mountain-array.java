class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      
//      int i=0;
//       int j=arr.length-1;
//       int n=arr.length;
//       while(i<j){
//         int mid = (i + j) / 2;
//             if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == n - 1 || arr[mid + 1] < arr[mid]))
//                 return mid;
//             else if (mid > 0 && arr[mid - 1] > arr[mid])
//                 j = mid - 1;
//             else
//                 i = mid + 1;
        
        
//       }
//       return i;
     
 
      
      
      
//Solution 2
      
      int n=arr.length;
       int i=0;
     for(i=0;i<n-1;i++){
        if(arr[i+1]<arr[i])
          break;
        
        
      
      }
      return i;
      
      
    }
    
}