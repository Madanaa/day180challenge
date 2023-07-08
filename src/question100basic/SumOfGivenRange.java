package question100basic;

public class SumOfGivenRange {
    public static void sumOfRange(int r, int n) {
        int sum = 0;
        for (int i = r; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfRange(1,5);
    }
}
