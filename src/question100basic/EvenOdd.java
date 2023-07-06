package question100basic;

public class EvenOdd {
    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        evenOdd(6);
    }
}
