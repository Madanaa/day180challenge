package day7;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 7;
        int i = 0;
        //int p = i;
        if (n <= 1) {
            System.out.println("Not prime");
        }
        int count = 0;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime "+i);
        }
    }
}
