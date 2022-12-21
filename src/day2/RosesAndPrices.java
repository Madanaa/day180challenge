package day2;

import java.util.Scanner;

public class RosesAndPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // test case
        while (t-->0) {
            int numOfRoses = scanner.nextInt();
            int prices[] = new int[numOfRoses];
            for (int i = 0; i < numOfRoses;i++) {
                prices[numOfRoses] = scanner.nextInt();
            }
            int totalMoney = scanner.nextInt(); // total money deepak has
            pairOfRoses(prices,totalMoney);
            System.out.println();

        }
    }
    public static void pairOfRoses(int prices [], int totalMoney) {
        int p1 = 0;
        int p2 = 0;
        int small,big;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length-1;i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] + prices[j] == totalMoney) {
                    if (prices[i] > prices[j]) {
                        small = prices[j];
                        big = prices[i];
                    } else {
                        small = prices[i];
                        big = prices[j];
                    }
                    if (diff >= big-small) {
                        p1 = small;
                        p2 = big;
                        diff = big -small;
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+p1+" and "+p2+".");
    }
}
