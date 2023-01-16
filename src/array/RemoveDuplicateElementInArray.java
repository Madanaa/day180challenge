package array;

import java.util.Arrays;

public class RemoveDuplicateElementInArray {
    public static void main(String[] args) {
        int[] a = {5,1,2,6,4,4,5,5};
        duplicateFind(a);
    }
    public static void duplicateFind(int a[]) {
        Arrays.sort(a);
        int j = 0;
        for (int i = 0; i < a.length-1;i++) {
            if (a[i] != a[i+1]) {
                a[j++] = a[i];

            }

        }
        a[j++] = a[a.length-1];
        for (int k = 0; k < j; k++) {
            System.out.println(a[k]+" ");
        }
    }
}
