class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      boolean ans=false;
      int r=matrix.length;
      int c=matrix[0].length;
        for(int i=0;i<r;i++){
          if(matrix[i][0]<target && target<matrix[i][c-1]){
            ans=binarySearch(matrix[i],target);
          }
          else if(matrix[i][0]==target || matrix[i][c-1]==target)
            ans=true;
          else{
            continue;
          }
          
        }
      return ans; 
    }
   public static boolean binarySearch(int[] arr,int target){
       int i=0,j=arr.length-1;
     
     while(i<=j){
       int mid=i+(j-i)/2;
       if(arr[mid]==target)
         return true;
       else if(target<arr[mid]){
         j=mid-1;
       }
       else{
         i=mid+1;
       }
         
     }
     return false;
   }
}