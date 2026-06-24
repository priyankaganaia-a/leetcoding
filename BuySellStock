//121. Best Time to Buy and Sell Stock
/*my approach takes lowest stock prize as best transaction for buy this will lead to waiting
for the proze to fall significantly and not prize hikes to gain profit from */

/*better approach is to keep track of PROFIT that could be made for EACH DAY considering it
the selling day and calculate the selling prize for the profit made from the cheapest stock
prize seen before that day*/
  
//Keep track of the minimum price so far and the maximum profit so far while scanning left to right.

class BuySellStock {

    public int maxProfit(int[] prices) {
        //global minimum prize
        int buy = Arrays.stream(prices).min().getAsInt();
        int index  = IntStream.range(0,prices.length)
                                .filter(i -> prices[i] == buy)
                                .findFirst()
                                .orElse(-1);
       int[] subarray = Arrays.copyOfRange(prices,index,prices.length);
       int sell = Arrays.stream(subarray).max().getAsInt();

       if(buy<sell){
        return sell - buy;
       }
       else{
        return 0;
       }

    }
}
