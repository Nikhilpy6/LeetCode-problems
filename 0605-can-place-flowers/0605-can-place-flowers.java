class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        if (n == 0) return true;
        if (fb.length == 1) return fb[0] == 0;

        for (int i = 0; i < fb.length; i++) {
            if (fb[i] == 0) {
                if ((i == 0 || fb[i - 1] == 0) && (i == fb.length - 1 || fb[i + 1] == 0)) {
                    fb[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}