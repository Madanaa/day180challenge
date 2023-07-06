package question100basic;

public class SumOfFirstNnaturalNumber {
    public static void sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfN(5);
    }
}
