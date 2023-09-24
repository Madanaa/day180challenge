package day31;

public class NumberCount {
    public static void main(String[] args) {
        int n = 12456;
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
