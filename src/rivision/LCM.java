package rivision;

import java.util.Scanner;

public class LCM {
    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
    }
}
