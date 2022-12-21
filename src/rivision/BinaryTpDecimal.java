package rivision;

import java.util.Scanner;

public class BinaryTpDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//0011;
        int ans = 0;
        int power = 1;
         while (n > 0) {
             int lastDigit = n % 2;
             ans = ans + lastDigit * power;
             power = power * 2;
             n /= 10;
         }
        System.out.println(ans);
    }
}
