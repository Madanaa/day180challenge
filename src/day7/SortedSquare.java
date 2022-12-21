package day7;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        int[] a = {4,1,5,2,3,0,6};
        Arrays.sort(a);
        for (int i = 0; i < a.length;i++) {
            System.out.print((int)Math.pow(a[i],2)+" ");
        }
    }
}
