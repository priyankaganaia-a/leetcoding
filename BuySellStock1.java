class  BuySellStock1 {
    public int maxProfit(int[] prices) {
        int  buy  = prices[0];
        int sell;
        int profit = 0;
        int newProfit = 0;
        for(int i = 0; i < prices.length ; i++){
            sell = prices[i];
            if(buy > sell){
                buy = sell;
            }
            if(sell > buy){
                newProfit  = sell - buy;
            }
            if(newProfit > profit){
                profit  = newProfit;
            }
        }
         return profit;
    }
}
