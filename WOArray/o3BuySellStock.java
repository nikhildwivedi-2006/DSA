package WOArray;

public class o3BuySellStock {

    static int buySell(int prices[]) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // find minimum price of stock
            minPrice = Math.min(minPrice, prices[i]);

            // calculate current profit
            int profit = prices[i] - minPrice;

            // update maximum profit
            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buySell(prices));
    }
}
