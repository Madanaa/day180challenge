package array;

public class FindPairInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int sum = 9;
        int start = 0;
        int end = a.length-1;
        while (start < end) {
            if (a[start]+ a[end] > sum) {
                end--;
            }
            else if(a[start]+a[end] < sum) {
                start++;
            } else if (a[start] + a[end] == sum) {
                System.out.println("Pair (" +a[start]+" , "+a[end]+" )");
                start++;
                end--;
            }
        }
    }
}
