class Solution {
    public int[] findArray(int[] pref) {
        int []arr = new int[pref.length];
      int pxor=pref[0];
      arr[0]=pref[0];
      for(int i=1;i<pref.length;i++){
        arr[i] = pxor ^ pref[i];
        pxor ^= arr[i];
        
      }
      return arr;
    }
}