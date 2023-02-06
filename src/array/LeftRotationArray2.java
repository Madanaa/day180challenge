package array;

import static array.LeftRotate.leftRotate;

public class LeftRotationArray2 {
    public static void leftRotation(int[] a, int d, int n) {
        int p = 1;
        while (p <= d) {
            int last = a[0];
            for (int i = 0; i < n-1; i++) {
                a[i] = a[i+1];
            }
            a[n-1] = last;
            p++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = a.length;
        int d = 3;
        leftRotation(a,d,n);
    }
}
