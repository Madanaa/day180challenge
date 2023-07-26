package array;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Find the minimum stock price
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Calculate potential profit and update maxProfit
                int potentialProfit = price - minPrice;
                maxProfit = Math.max(maxProfit, potentialProfit);
            }
        }

        return maxProfit;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("Maximum profit: " + profit);
    }
}

