class Solution {
    public  void comb(int st,int k,int n,List<Integer> l,List<List<Integer>> list){
      if(k<0 && n<0)
        return;
      if(k==0 && n==0){
        list.add(new ArrayList(l));
        return;
      }
      for(int i=st;i<=9;i++){
        l.add(i);
        comb(i+1,k-1,n-i,l,list);
        l.remove(l.size()-1);
      }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        comb(1,k,n,new ArrayList(),list);
        return list;
    }
}