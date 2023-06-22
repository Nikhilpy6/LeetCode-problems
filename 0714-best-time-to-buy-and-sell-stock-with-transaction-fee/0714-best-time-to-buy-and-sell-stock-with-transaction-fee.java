class Solution {
    public int maxProfit(int[] price, int fee) {
        int len = price.length, buying = 0, selling = -price[0];
        for (int i = 1; i < len; i++) {
            buying = Math.max(buying, selling + price[i] - fee);
            selling = Math.max(selling, buying - price[i]);
        }
        return buying;

    }
}