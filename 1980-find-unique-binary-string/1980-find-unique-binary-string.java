class Solution {
    private String ans="";
    HashSet<String> set = new HashSet<>();
  
    private void backtrack(int n,String s){
      if(s.length()==n){
        if(!set.contains(s) && ans=="")
        { 
          ans=s;
        }
        return;
      }
       backtrack(n,s+('0'));
       backtrack(n,s+('1'));
      
      
    }
  
    public String findDifferentBinaryString(String[] nums) {
        for(String a: nums){
          set.add(a);
        }
          int n=nums[0].length();
          backtrack(n,"");
          return ans;
        
    }
}