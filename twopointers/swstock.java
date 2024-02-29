class swstock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low = 0;
        int high = 1;
        while (high < prices.length) {
            if (prices[low] < prices[high]) {
                max = Math.max(max, prices[high] - prices[low]);

            }

            else {
                low = high;
            }
            high++;
        }
        return max;
    }
}