package day1;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int t = scanner.nextInt();
        while (t < 0) {
            int rem = scanner.nextInt();
             rem = rem % n;
             int temp[] = new int[n];
             for (int i = 0; i < n; i++) {
                 temp[i] = array[i];
             }
             for (int i = 0; i < n; i++) {
                 temp[i] = array[i]+ array[(i-rem+n)%n];
             }
             for (int i = 0; i < n; i++) {
                 array[i] = temp[i];
             }
             t++;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
