package day20;

import java.util.Scanner;

public class CumculativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[1000];
        int sum = 0, index = 0;

        // read input numbers into the array and add them to the sum
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;

            // stop processing input if the cumulative sum becomes negative
            if (sum < 0) {
                break;
            }

            // add the number to the array if the cumulative sum is still non-negative
            numbers[index++] = num;
        }

        // print out the numbers processed before the cumulative sum became negative
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
    }
}

