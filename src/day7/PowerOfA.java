package day7;

public class PowerOfA {
    public static void main(String[] args) {
        int n = 4;
        int exponent = 2;
        int p = 1;
        int i = 1;
        while (exponent >= i ) {
            p = p * n;
            i++;
        }
        System.out.println(p);
    }
}
