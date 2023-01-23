package array;

public class FindPeackElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.print("Index of a peak point is " + findPeak(arr, n));
    }
    public static int findPeak(int[] a, int n) {
        if (n == 1)
            return 0;
        if (a[0] >= a[1])
            return 0;
        if (a[n-1] >= a[n-2])
            return 0;
        for (int i = 1; i < n -1; i++){
            if (a[i] >= a[i-1] && a[i] >= a[i+1])
                return i;
        }
        return 0;
    }
}
