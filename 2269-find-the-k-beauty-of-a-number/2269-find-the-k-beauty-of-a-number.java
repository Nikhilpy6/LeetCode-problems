class Solution {
  private boolean checkisDivisible(int n,int number){
   try{ 
    if(number%n==0)return true;
   }
   catch (ArithmeticException e){
      return false;
    }
    return false;
  }
    public int divisorSubstrings(int num, int k) {
        // 1st approach can be using the string
      // 2nd approach can be using only work on k digits
      int number=num;
      String str = Integer.toString(num);
      int ans=0;
  //     System.out.println(str);
  // return 0;
      int st=0;
      for(int end = 0;end<str.length();end++){
        
        while(end-st+1 > k){
          st++;
        }
        if(end-st+1 == k){
          if(checkisDivisible(Integer.parseInt(str.substring(st,end+1)),number)==true){
            ans++;
          }
        }
      }
      return ans;
    }
}
/*

2269,
3,
438,
76,
239

*/