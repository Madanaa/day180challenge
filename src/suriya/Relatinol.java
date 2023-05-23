package suriya;

public class Relatinol {
    public static void main(String[] args) {
        float a = 7852.32f;
        float b = 1520f;
        if (a > b) {
            System.out.println("YES");
        }
        else {
            System.out.println("No");
        }
        float c = 10;
        int d = (int) (a+b);
        final float b1 = b;
        b /= c;
        System.out.println(d);
        System.out.println(b);
    }
}
