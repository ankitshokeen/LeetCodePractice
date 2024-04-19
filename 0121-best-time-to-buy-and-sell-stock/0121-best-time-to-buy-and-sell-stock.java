class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int mPro = 0;
        
        while (r < prices.length) {
            int profit = 0;
            
            if (prices[l] < prices[r]) {
                profit = prices[r] - prices[l];
                mPro = Math.max(mPro, profit);
             } else
                l = r;
                r += 1;
        }
        
        return mPro;
    }
}