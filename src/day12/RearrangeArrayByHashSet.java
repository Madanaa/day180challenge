package day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RearrangeArrayByHashSet {
    public static int[] rearrangeArray(int[] a) {
        Set<Integer> set = new HashSet<>();
        // storing all the element in hashSet
        for (int i = 0; i < a.length;i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < a.length;i++) {
            if (set.contains(i)){
                a[i] = i;
            }
            else {
                a[i] = -1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {-1, -1, 6, 1, 9, 3, 2, -1, 4,-1};
        System.out.println(Arrays.toString(rearrangeArray(a)));
//        for (int i = 0; i < a.length;i++) {
//            System.out.println(rearrangeArray(a));
//        }
    }
}
