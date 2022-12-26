package rivision;

public class LCMByRecursion {
    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {

    }
}
