public class maxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;


        int[] oneprofit = new int[prices.length];
        int buy_price = prices[0], profit = 0;

        //2 dp are used to solve problem
        for(int i=1;i<prices.length;i++){
            buy_price = Math.min(buy_price, prices[i]);
            profit = Math.max(profit, prices[i]-buy_price);
            oneprofit[i] = profit;
        }

        int res = oneprofit[prices.length-1];
        int sell_price = prices[prices.length-1];
        profit = 0;
        for(int i=prices.length-1;i>=1;i--){
            sell_price = Math.max(sell_price, prices[i]);
            profit = Math.max(profit, sell_price-prices[i]);
            res = Math.max(res, profit + oneprofit[i-1]);
        }

        return res;
    }
}
