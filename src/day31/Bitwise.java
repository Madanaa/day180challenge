package day31;

public class Bitwise {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int bitwiseAnd = x & y; // Bitwise AND
        int bitwiseOr = x | y; // Bitwise OR
        int bitwiseXor = x ^ y; // Bitwise XOR
        int bitwiseNot = ~x; // Bitwise NOT
        int leftShift = x << 2; // Left shift x by 2 bits
        int rightShift = x >> 1; // Right shift x by 1 bit
        System.out.println(bitwiseAnd);
        System.out.println(bitwiseOr);
        System.out.println(bitwiseXor);
    }
}
