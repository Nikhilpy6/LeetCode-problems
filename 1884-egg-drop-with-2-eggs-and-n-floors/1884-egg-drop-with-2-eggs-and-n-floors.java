class Solution {
    public int twoEggDrop(int n) {
      int a=1,cnt=0;
        while(n>0){
          n=n-a;
          cnt++;
          a++;
        }
      return cnt;
    }
}