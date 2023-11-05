class Solution {
    public int getWinner(int[] arr, int k) {
        int maxele = 0;
      for(int i:arr){
        maxele = Math.max(maxele,i);
      }
      if(arr.length<=k)return maxele;
      int win = arr[0];
      int strk=0;
      for(int i=1;i<arr.length;i++){
        int max = Math.max(win,arr[i]);
        if(max==win){
          strk++;
        }
        else{
          strk=1;
          win=max;
        }
        if(strk==k){
          break;
        }
        
        if(win==maxele)
          return maxele;
        
      }
      return win;
      
    }
}