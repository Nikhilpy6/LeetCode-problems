class Solution {
    public int findSpecialInteger(int[] arr) {
      if(arr.length==1)return 1;
        int cnt=1,max=0,prev=arr[0],ans=0;
        for(int i= 1;i<arr.length;i++){
          if(arr[i]==prev)cnt++;
          else{
            prev=arr[i];
            cnt=1;
          }
          
          if(max<cnt){
            max=cnt;
            ans=arr[i];
          }
          
        }
      return ans;
    }
}