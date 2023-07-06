package array;

public class BestTimeBuyAndSell {
    public static int maxProfitBuySell(int price[]) {
        int maxProfit = 0;
        int n = price.length;
        for (int i = 1; i < n; i++) {
            if (price[i] > price[i-1]) {
                maxProfit = maxProfit + (price[i] - price[i-1]);
            }
        }
        return maxProfit;
    }
//    public static int maxProfitBruteForce(int[] price) {
//        int maxProfit = 0;
//
//    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(maxProfitBuySell(price));
    }
}
