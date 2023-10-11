class Solution {
    private int binarySearchUpperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] > target) {
                result = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return result == -1 ? arr.length : result;
    }
  
  private int binarySearchLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] < target) {
                left = mid+1;
            } else {
                result = mid;
                right = mid-1;
            }
        }

        return result == -1 ? arr.length : result;
    }
  
  
  
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int start[] = new int[flowers.length];
        int end[] = new int[flowers.length];
      for(int i=0;i<flowers.length;i++){
        start[i] = flowers[i][0];
        end[i]=flowers[i][1];
      }
      int result[] = new int[people.length];
      Arrays.sort(start);
      Arrays.sort(end);
      for(int i=0;i<people.length;i++){
      
      int bloomed_already = binarySearchUpperBound(start, people[i]);
      int died_already = binarySearchLowerBound(end, people[i]);
      result[i] = bloomed_already - died_already;
        
      }
      return result;
    }
}