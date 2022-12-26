package rivision;

public class FibonacciSeries {
    static int fib(int n) {
       // return n != 0 && n != 1 ? fib(n - 1) + fib(n - 2) : n;
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
