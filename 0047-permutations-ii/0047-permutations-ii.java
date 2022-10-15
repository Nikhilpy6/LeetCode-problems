class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result =new HashSet<>();
        List<List<Integer>> answer=new ArrayList<>();
        boolean []visited=new boolean[nums.length];
        permutations(visited,result,nums,new ArrayList());
        for(List a: result){
          answer.add(a);
        }
        return answer;
    }
    private void permutations(boolean []visited,Set<List<Integer>>res,int[] nums,List<Integer>cur){
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