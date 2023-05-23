package array;

public class PairSum {
    // this brute force approach
    public static int pairSum(int a[], int k) {
        int count = 0;
        for (int i = 0; i < a.length;i++) {
            for (int j = i + 1; j < a.length;j++) {
                if (Math.abs(a[i] - a[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int k = 1;
        System.out.println(pairSum(a,k));
    }
}
