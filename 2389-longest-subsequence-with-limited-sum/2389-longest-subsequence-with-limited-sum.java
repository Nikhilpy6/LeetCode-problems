class Solution {
  public int[] answerQueries(int[] A, int[] queries) {
        Arrays.sort(A);
        int n = A.length, m = queries.length, res[] = new int[m];
        for (int i = 1; i < n; ++i)
            A[i] += A[i - 1];            //4 9 11 12 ===>CS
        for (int i = 0; i < m; ++i) {
            int j = Arrays.binarySearch(A, queries[i]);   // 3 10 21
            res[i] = Math.abs(j + 1);
        }
        return res;
    }
  private int binarySearch(int[] a, int k) {
        int lo = 0, hi = a.length-1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] <= k) {
                lo = mid + 1;
            }else {
                hi = mid;
            }
        }
        return lo;
    }
    
}