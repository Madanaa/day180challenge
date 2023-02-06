package array;

public class LeftRotate {
    public static  void leftRotate(int[] a, int n, int d) {
        int temp[] = new int[n];
        int k = 0;
        // step 1. store from d index to n
        for (int i = d; i < n; i++) {
            temp[k] = a[i];
            k++;
        }
        // step 2. now store first 2 element in temp[] array
        for (int i = 0; i < d; i++) {
            temp[k] = a[i];
            k++;
        }
        // step 3. copy the element of the temp[] into original array
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }

    }
    static void printArray(int a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = a.length;
        int d = 2;
        leftRotate(a,n,d);
        printArray(a);
    }
}
