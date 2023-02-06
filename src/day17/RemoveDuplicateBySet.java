package day17;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateBySet {
    static void removeDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length;i++) {
            set.add(a[i]);
        }
        set.forEach(e -> System.out.print(e+" "));
    }

    public static void main(String[] args) {
        int[] a = {5,1,2,6,4,4,5,51,89,14,14};
        removeDuplicate(a);
    }
}
