package day7;

public class First_Digit {
    public static void first_d(int n) {
        int fd = n;
        int last = n;
        while (fd >= 10) {
            fd = fd / 10;
           // fd = fd / 10;
            last = last % 10;

        }
        System.out.println(fd+" "+last);
    }
    public static void main(String[] args) {
        first_d(5326);
    }
}
