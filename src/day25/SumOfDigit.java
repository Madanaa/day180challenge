package day25;

public class SumOfDigit {
    public static void sumOfDigit(int n) {
        int sum = 0;
         while (n != 0) {
             int rem = n % 10;
             sum = sum + rem;
             n = n / 10;
         }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        sumOfDigit(1234);

    }
}
