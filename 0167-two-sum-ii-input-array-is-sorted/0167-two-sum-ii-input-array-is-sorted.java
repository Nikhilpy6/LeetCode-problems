class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind[]=new int[2];
      int i=0;
      int j=numbers.length-1;
      while(i<j){
        if(numbers[i]+numbers[j]==target){
          ind[0]=i+1;
          ind[1]=j+1;
          break;
        }
        else if(numbers[i]+numbers[j]>target)
          j--;
        else
          i++;
          
      }
      return ind;
    }
}