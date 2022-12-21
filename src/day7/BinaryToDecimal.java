package day7;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int pow = 1;
        while (n > 0) {
            int ld = n % 2;
            ans = ans + ld * pow;
            pow = pow * 2;
            n /= 10;
        }
        System.out.println(ans);
    }
}
