package day2;

import java.util.Scanner;

public class RunningOfSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int result [] = new int[a.length];
        result[0] = a[0];
        for (int i = 1; i <a.length;i++) {
            // here logic
            result[i] = result[i-1] + a[i];
           // System.out.println(result[i]);
        }
           for (int i = 0; i < result.length;i++) {
               System.out.print(result[i]+" ");
           }
    }
}
