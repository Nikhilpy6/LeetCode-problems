class Solution {
    public int totalMoney(int n) {
        if(n<7){
            return (n*(n+1)/2);
        }
      
       int rem = n%7;
       int num = n/7;
      // num =3 ,n=25
      // rem =4
      int val = num+1;
      int ans = (num*(2*28+(num-1)*7))/2;
      int ans1  = (rem *(2*val+(rem-1)))/2;
      return ans+ans1;

    }
}
              