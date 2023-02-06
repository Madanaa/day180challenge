package array;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] a = {1,6,8,5,7};
        int n = a.length;
         int insertEl = 3;
         int el = 9;
         for (int i = n-1; i > insertEl; i--) {
             a[i] = a[i-1];
         }
         a[insertEl] = el;
         for (int i = 0; i < n; i++) {
             System.out.print(a[i]+" ");
         }
    }
}
