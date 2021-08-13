package Misc;

public class StockSell1 {
    //Brute force
    //Simple approach but time limit exceeds
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;

    }

    //Instead of doing in two loop we can solve in one loop.
    //Always look for the minimum price for each price.
    //If we can find any previous minimum price for a present day price then
    //present price-previous minimum price we can calculate.
    //If that value is greater than current maxProfit then we can return it.


    public int maxProfitOptimized(int[] prices) {
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
                minPrice= prices[i];
            else{
                int curProfit=prices[i]-minPrice;
                maxProfit=Math.max(maxProfit,curProfit);
            }
        }
        return maxProfit;
    }
}
