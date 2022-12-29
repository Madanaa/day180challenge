package day12;

public class SumOfEvenOdd1 {
    public static int sumE(int n) {
        return n * (n+1);
    }
    public static int sumO(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        System.out.print(sumE(10)+" ");
        System.out.println(sumO(10));
    }
}
