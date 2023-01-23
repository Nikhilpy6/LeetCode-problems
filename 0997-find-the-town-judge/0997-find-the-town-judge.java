class Solution {
    public int findJudge(int n, int[][] trust) {
      if(n==1 && trust.length==0)return 1;
      int ar[]=new int[n+1];
      for(int a[]:trust){
        ar[a[0]]--;
        ar[a[1]]++;
      }
      for(int i=0;i<ar.length;i++){
        if(ar[i]==n-1)return i;
      }
      return -1;
        
    }
}