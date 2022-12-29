package day12;

public class RearrangeArray {
    public static void rearrangeArray(int[] a, int n) {
        int i,j,temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (a[j] == i) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    break;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (a[i] != i) {
                a[i] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int a[]  = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        rearrangeArray(a,a.length);
        for (int i = 0; i < a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
