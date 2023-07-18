package array;

import java.util.Arrays;

public class KthLargestElement {
    public static int kthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
  public static void kthLargest1(int[] a, int k) {
        int max = a[0];
        for (int i = 0; i < k;i++){
            if (a[i] > max) {
                max = a[i];
            }
        }
      System.out.println(max);
  }
    public static void main(String[] args) {
        int [] a = {7, 10, 4, 3, 20, 15};
        int k = 2;
       // System.out.println(kthLargest(a,k));
        kthLargest1(a,k);
    }
}
