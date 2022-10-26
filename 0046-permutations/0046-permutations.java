class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        boolean []visited=new boolean[nums.length];
        permutations(visited,res,nums,new ArrayList());
        return res;
    }
    private void permutations(boolean []visited,List<List<Integer>>res,int[] nums,List<Integer>cur){
        if(cur.size()==nums.length){
            res.add(new ArrayList(cur));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true)continue;
            cur.add(nums[i]);
            visited[i]=true;
            permutations(visited,res,nums,cur);
            cur.remove(cur.size()-1);
            visited[i]=false;
        }
    }
}