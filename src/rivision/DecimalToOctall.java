package rivision;

public class DecimalToOctall {
    public static void main(String[] args) {
        int n = 63;
        //boolean i = false;

        while (n != 0) {
            int rem = n % 2;
            n /= 8;
           // i = true;
            for (int j = 1; j >= 0; --j) {
                System.out.print(j);
            }
        }

    }
}

