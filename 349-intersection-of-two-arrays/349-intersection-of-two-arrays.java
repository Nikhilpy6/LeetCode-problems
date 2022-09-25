class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0;
      while(i<nums1.length && j<nums2.length){
        if(nums1[i]>nums2[j])j++;
        else if(nums2[j]>nums1[i])i++;
        else{
          set.add(nums1[i]);
          i++;
          j++;
        }
      }
      int arr[]=new int[set.size()];
        i=0;
      for( int a: set){
        arr[i++]=a;
      }
      return arr;
    }
}