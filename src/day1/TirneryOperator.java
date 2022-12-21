package day1;

import java.io.Serializable;

public class TirneryOperator {
    public static void main(String[] args) {
        int n = 6;
        final int i = 9;
        Serializable p =  n < 0  ? n :  n < 7 ? 9: n;
        System.out.println(p);
    }
}
