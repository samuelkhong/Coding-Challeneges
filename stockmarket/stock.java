class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        int low = prices[0];
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            }
            int currentProfit = -1 * low + prices[i];
            if (currentProfit > profit) {
                profit = currentProfit;
            }

        }
        return profit;
        
        
    }
        
    
}