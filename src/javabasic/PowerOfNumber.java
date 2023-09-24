package javabasic;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 4;
        int power = 2;
        int result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        System.out.println(result);
    }
}
