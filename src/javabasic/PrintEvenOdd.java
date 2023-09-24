package javabasic;

public class PrintEvenOdd {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i+" ");
            }
        }
    }
}
