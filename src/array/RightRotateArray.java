package array;

public class RightRotateArray {
    public static void rightRotate(int[] a, int n, int k) {
         k = k % n;
         for (int i = 0; i < n; i++) {
             if (i < k) {
                 System.out.print(a[n + i - k]+" ");
             }
             else {
                 System.out.print(a[i-k]+" ");
             }
         }
        System.out.println();
    }

    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 9, 8};
        int k = 2;
        rightRotate(Array,Array.length,k);
    }
}
