package day9;

import java.util.Scanner;

public class PaintersPartitation {
    static int sum(int arr[], int start, int end)
    {
        int total = 0;
        for (int i = start; i <= end; i++)
            total += arr[i];
        return total;
    }

    // for n boards and k partitions
    static int partition(int arr[], int n, int k)
    {
        // base cases
        if (k == 1) // one partition
            return sum(arr, 0, n - 1);
        if (n == 1)  // one board
            return arr[0];

        int best = Integer.MAX_VALUE;

        // find minimum of all possible maximum
        // k-1 partitions to the left of arr[i],
        // with i elements, put k-1 th divider
        // between arr[i-1] & arr[i] to get k-th
        // partition
        for (int i = 1; i <= n; i++)
            best = Math.min(best, Math.max(partition(arr, i, k - 1),
                    sum(arr, i, n - 1)));

        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(partition(array,k,n));
    }
}
