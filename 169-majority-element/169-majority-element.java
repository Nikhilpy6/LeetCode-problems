class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int el=0;
        for(int a:nums){
            if(cnt==0)
                el=a;
            if(el==a)
                cnt++;
            else
                cnt--;
        }
        return el;
    }
}