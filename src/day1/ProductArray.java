package day1;

import java.util.Scanner;

public class ProductArray {
    public void productAr(long a[],long n) {
        if (n==1){
            System.out.print(0);
        }
        // initialize memory to all array
        long left[] = new long[(int) n];
        long right[] = new long[(int) n];
        long prod[] = new long[(int) n];
        long i,j;
        left[0] = 1;
           /* Left most element of left array
is always 1 */
        left[0] = 1;

        /* Right most element of right
array is always 1 */
        right[(int) (n - 1)] = 1;
        // construct the left memory
        for ( i = 1; i < n; i++){
            left[(int) i] = a[(int) (i-1)] * left[(int) (i-1)];
        }
        // construct the right memory
        for (j = n-2; j >=0;j--){
            right[(int) j] = a[(int) (j+1)] * right[(int) (j+1)];
        }
        for (i = 0; i < n; i++)
            prod[(int) i] = left[(int) i] * right[(int) i];

        for (i = 0; i < n; i++){
            System.out.print(prod[(int) i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductArray p  = new ProductArray();
        long n = scanner.nextInt();
        long a[] = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        p.productAr(a,a.length);
    }
}
