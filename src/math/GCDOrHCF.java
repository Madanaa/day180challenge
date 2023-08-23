package math;

public class GCDOrHCF {
    public static void gcdOrHcf(int n1, int n2) {
        int hcf = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }

    public static void main(String[] args) {
        gcdOrHcf(15,25);
    }
}
