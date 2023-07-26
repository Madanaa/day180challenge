package twopointer;

import java.util.Arrays;

public class TripalSumTarget {
    public static boolean tripleSum(int[] a,int target) {
        Arrays.sort(a);
        for (int i = 0; i < a.length-2; i++) {
            int left = i + 1;
            int right = a.length - 1;

        }
        return true;
    }
    public static void main(String[] args) {

    }
}
