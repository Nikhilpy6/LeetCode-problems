class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,1,k,new ArrayList(),n);
        return res;
    }
    void backtrack(List<List<Integer>> res,int st,int k,List<Integer>list,int n){
        
            
        if(list.size()==k){
            res.add(new ArrayList(list));
            return;
        }
        for(int i=st;i<=n;i++){
            list.add(i);
            backtrack(res,i+1,k,list,n);
            list.remove(list.size()-1);
        }
    }
}