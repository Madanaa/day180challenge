package day2;

import java.util.Scanner;

public class ReverseArray {
    static void reverse(long a[], long n) {

        for (long i = n-1; i >= 0; i--) {
            System.out.print(a[(int)i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a[] = new long[n];
        for (long i = 0; i < n; i++) {
            a[(int)i] = scanner.nextInt();
        }
        reverse(a,a.length);
    }
}
