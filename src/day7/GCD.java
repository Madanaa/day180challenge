package day7;

public class GCD {
    public static int gcd(int a, int b){
        int gcdd = 0;
        for (int i = 1; i <= a && i <= b;i++) {
            if (a % i == 0 && b % i ==0) {
                gcdd = i;
            }
        }
        return gcdd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(15,25));
    }
}
