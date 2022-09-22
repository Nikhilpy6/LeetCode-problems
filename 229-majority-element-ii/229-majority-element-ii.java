class Solution {
    public List<Integer> majorityElement(int[] nums) {
    HashMap < Integer, Integer > mp = new HashMap < > ();
    ArrayList < Integer > ans = new ArrayList < > ();
    int n= nums.length;
    for (int i = 0; i < n; i++) {
      mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
    }

    for (int x: mp.keySet()) {
      if (mp.get(x) > (n / 3))
        ans.add(x);
    }

    return ans;
    }
}