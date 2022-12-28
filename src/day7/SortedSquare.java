package day7;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        int[] a = {-5,1,5,2,3,0,6};
        for (int i = 0; i < a.length;i++) {
            final double pow = Math.pow(a[i], 2);
        }

        Arrays.sort(a);
        for (int i = 0; i < a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
