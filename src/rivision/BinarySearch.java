package rivision;

public class BinarySearch {
    public static int binarySearch(int[] a, int item) {
        int low = 0;
        int high = a.length-1;
        while (low < high) {
            int mid = (low+high)/2;
            if (a[mid] == item)
            {
                return mid;
            }
            else if (a[mid] < item) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 12, 13, 15, 16, 18, 19, 20 };
        int item = 7;
        System.out.println(binarySearch(arr,item));
    }
}
