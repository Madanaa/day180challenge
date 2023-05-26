package array;

public class LinearSearch {
    static int binarySearch(int a[], int value) {
          int i;
        for (i = 0; i < a.length;i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int a[] = {1,7,8,5};
        int value = 7;
        System.out.println(binarySearch(a,value));
    }
}
