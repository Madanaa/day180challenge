package recursion;

public class Print5Incresing {
    static int PD(int n) {
        if (n == 0)
            return 1;
        System.out.println(n);
        return PD(n-1);
    }

    public static void main(String[] args) {
        PD(5);
    }
}
