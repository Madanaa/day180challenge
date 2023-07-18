package question100basic;

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
        int i = 0;
        for ( i = 10; i <= 23; i++) {



            if (checkPrime(i)) {
                System.out.println(i+ " Prime");
            }
            else {
                System.out.println(i+ " Not prime");
            }
        }
        System.out.println(checkPrime(i));
    }
}
