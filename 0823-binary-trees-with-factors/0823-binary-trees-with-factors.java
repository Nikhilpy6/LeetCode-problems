class Solution {
  int MOD = (int)(1e9+7);
    public int numFactoredBinaryTrees(int[] arr) {
//       HashMap<Integer,Long> hm = new HashMap<>();
//       for(int i:nums)hm.put(i,hm.getOrDefault(i,0L)+1);
      
//       Arrays.sort(nums);
//       int ans=0;
//       for(int i=1;i<nums.length;i++){
//         for(int j=0;j<i;j++){
//           if(nums[i]%nums[j]==0 ){
            
//             long v = nums[i]/nums[j];
//             if(hm.containsKey(v)){
//               long lc =hm.get(nums[j]);
//               long rc = hm.get(v);
              
//               long val = lc*rc;
              
//               hm.put(nums[i],hm.getOrDefault(nums[i],0L)+val);
//             }
            
//           }
          
//         }
//       }
//       for(long v:hm.values()){
//         ans+=(int)(v)%mod;
//       }
//       return ans%mod;
      int n = arr.length;
        Arrays.sort(arr);

        Map<Integer, Long> mp = new HashMap<>();
        mp.put(arr[0], 1L);

        for (int i = 1; i < n; i++) {
            long count = 1;

            for (int j = 0; j < i; j++) {
                int v = arr[j];
                if (arr[i] % v == 0 && mp.containsKey(arr[i] / v)) {
                    count += (mp.get(v) * mp.get(arr[i] / v)) % MOD;
                    count %= MOD;
                }
            }

            mp.put(arr[i], count);
        }

        int result = 0;
        for (long val : mp.values()) {
            result = (int) ((result + val) % MOD);
        }
        return result;
    }
}