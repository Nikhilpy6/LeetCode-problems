class Solution {
    public List<Integer> getRow(int rowIndex) {
       //List< List<Integer>> ans= new ArrayList<>();
      List<Integer>arr, prev=null;
      for(int i=0;i<=rowIndex;i++){
        arr=new ArrayList<>();
        for(int j=0;j<=i;j++){
          if(j==0 || j==i)
            arr.add(1);
          else
            arr.add(prev.get(j-1)+prev.get(j));
        }
        prev=arr;
       // ans.add(arr);
      }
      return prev;
    }
}