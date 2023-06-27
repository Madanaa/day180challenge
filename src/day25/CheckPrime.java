package day25;

public class CheckPrime {
    public static boolean checkPrime(int n) {
        int count = 0;
        if (n < 2)
            return false;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 2)
            return false;
        return true;

    }
    public static void main(String[] args) {
        if (checkPrime(23)) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
