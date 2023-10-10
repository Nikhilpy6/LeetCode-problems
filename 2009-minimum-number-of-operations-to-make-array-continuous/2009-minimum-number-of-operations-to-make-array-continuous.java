class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int res = n;//isse jada nahi ho skte
      
      
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)set.add(i);
        int arr[]=new int[set.size()];
        int v=0;
        for(int i:set)arr[v++]=i;
     
        Arrays.sort(arr);
       
        int len = arr.length;
      
        for(int i=0,j=0;i<len;i++){
          
          while (j < len && arr[j] - arr[i] <=n - 1) {
                j++;
            }
          res =Math.min(res,n-(j-i));
          
  
          
          
        }
      return res;
      
      
    }
}