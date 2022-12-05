class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
      int max=0;
      for(int a:candies){
        max=Math.max(a,max);
      }
      for(int a:candies){
        if((a+extraCandies)>=max)
          ans.add(true);
        else{
          ans.add(false);
        }
      }
      return ans;
    }
}