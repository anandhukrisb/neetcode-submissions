class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int maxP = 0;
        for(int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxP = Math.max(maxP, prices[i] - min);
        }

        return maxP;

    }
}
