class Solution {
    static public int recursion(List<Integer> list ,int k){
      int ind=0;
      while(list.size()>1){
        int i=(ind+k)%list.size();
        ind=i;
        list.remove(i);
        //System.out.println(list.remove(i));
      }
      return list.get(0);
    }
    public int findTheWinner(int n, int k) {
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<n;i++){
        list.add(i+1);
      }
      int a =recursion(list,k-1);
      return a;
    }
}