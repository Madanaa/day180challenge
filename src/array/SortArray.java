package array;

public class SortArray {
    public static void sortA(int[] a, int n){
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
           for (int j = i + 1; j < a.length; j++) {
               if (a[i] > a[j]) {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,8,3,5,10};

        sortA(a,a.length);
    }
}
