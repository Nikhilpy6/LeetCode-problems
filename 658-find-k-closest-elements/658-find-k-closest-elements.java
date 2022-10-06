class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     
      List<Integer> answer= new ArrayList<>();
      int st=0;
      int end=arr.length-1;
      while(end-st >=k){
        if(Math.abs(arr[st]-x) > Math.abs(arr[end]-x))
           st++;
        else
           end--;
      }
      
      
      for(int i=st;i<=end;i++){
        answer.add(arr[i]);
      }
      return answer;
    }
}