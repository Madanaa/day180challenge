package javabasic;

public class PrintAllCharValue {
    public static void main(String[] args) {
        for (int i = 0; i <= 256; i++) {
            System.out.println("Value of all ascii "+(char)i+" "+i);
        }
    }
}
