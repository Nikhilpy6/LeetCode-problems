class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[]=new int[101];
        int answer=0;
        for(int num:nums){
            answer+=count[num]++;
        }
        return answer;
    }
}