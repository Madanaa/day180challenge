package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueInArray {
    public static void main(String[] args) {
        int a[] = {1,5,2,1,4,7,7};
        Set<Integer> set = new HashSet<>();
        boolean isDuplicateCheck = false;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                isDuplicateCheck = true;
                System.out.print(" "+a[i]+" ");
            }
            else {
                set.add(a[i]);
            }
        }
        if (!isDuplicateCheck) {
            System.out.println(-1);
        }
    }
}
