class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
      Arrays.sort(arr);
      int mini = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
          int diff=Math.abs(arr[i]-arr[i-1]);
         // hm.put(diff,hm.getOrDefault(diff,0)+1);
          mini = Math.min(mini,diff);
        }
      List<List<Integer>> ans = new ArrayList<>();
      for(int i=1;i<arr.length;i++){
        int diff=Math.abs(arr[i]-arr[i-1]);
        if(diff == mini){
        List<Integer> li = new ArrayList<>();
        li.add(arr[i-1]);
        li.add(arr[i]);
        ans.add(li);
        }
        
      }
      return ans;
    }
}