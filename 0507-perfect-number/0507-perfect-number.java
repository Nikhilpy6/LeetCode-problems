class Solution {
    public boolean checkPerfectNumber(int num) {
        long sum=1;
      if(num==1)return false;
      for(int i=2;i*i<=num;i++){
        if(num%i==0){
          sum+=(i+num/i);
        }
      }
      // System.out.p
      return (int)sum == num;
    }
}