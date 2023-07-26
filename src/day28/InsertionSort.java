package day28;

public class InsertionSort {
    public static void insertionSort(int[]a) {
        for (int i = 1; i < a.length;i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j = j - 1;
            }
           // a[j+1] = a[j];
           // j = j - 1;
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
       int  a[] = {3,1,6,4,5};
       insertionSort(a);
       for (int i = 0; i < a.length;i++){
           System.out.print(a[i]+" ");
       }
    }
}
