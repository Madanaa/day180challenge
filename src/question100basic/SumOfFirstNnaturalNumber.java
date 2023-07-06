package question100basic;

public class SumOfFirstNnaturalNumber {
    // by for loop
    public static void sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    // by formula
    // sum = (num * (num + 1)) / 2
    public static void sumOfN1(int num) {
        int res = (num * (num + 1)) / 2;
        System.out.println(res);
    }
    // by recursion
    public static int sumOfN2(int n) {
        if (n == 0)
            return n;
        return n + sumOfN2(n - 1);
    }

    public static void main(String[] args) {
        sumOfN(5);
        sumOfN1(5);
        System.out.println(sumOfN2(5));
    }
}
