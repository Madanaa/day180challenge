package day15;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {1,6,1,5,1};
//        Arrays.sort(a);
//        for (int i = 0; i < a.length;i++) {
//            System.out.println(a[a.length/2]);
//        }
        System.out.println(majoritoty(a));

    }
    public static int majoritoty(int [] a) {
        Arrays.sort(a);
        return a[a.length/2];
    }
}
