class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
      List<Integer> list = new ArrayList<>();
      for(int i=left;i<=right;i++){
        int n = i;
        int cnt=0;
        while(n>0){
          int dig = n%10;
          if(dig==0){
            cnt=0;
            break;
          }
          else if(i%dig==0){
            cnt++;
            n/=10;
          }
          else{
            cnt=0;
            break;
          }
          
          
        }
        if(cnt!=0)list.add(i);
        
        
      }
      return list;
      
    }
}