package javabasic;

public class ExtractDigit {
    public static void main(String[] args) {
        int n = 4321;
        while (n != 0) {
            int rem = n % 10;
            System.out.println(rem+" ");
            n = n / 10;
        }
    }
}
