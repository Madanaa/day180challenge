package javabasic;

public class CheckAlphabetsOrNot {
    public static void main(String[] args) {
        char c = 'a';
        if ((c >='a' && c <='z') || (c >= 'A' && c <= 'Z') ) {
            System.out.println(c+" is an alphabet");
        }
    }
}
