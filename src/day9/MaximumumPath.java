package day9;

import java.util.Scanner;

public class MaximumumPath {
    int max(int x, int y) {
        return (x > y) ? x : y;
    }
     int maxPathSum(int ar1[], int ar2[], int m, int n)
    {
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;

        // Initialize result and current sum through ar1[]
        // and ar2[].
        int result = 0, sum1 = 0, sum2 = 0;

        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];

                // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];

                // we reached a common point
            else {
                // Take the maximum of two sums and add to
                // result
                // Also add the common element of array,
                // once
                result += max(sum1, sum2) + ar1[i];

                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;

                // update i and j to move to next element of
                // each array
                i++;
                j++;
            }
        }

        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];

        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];

        // Add maximum of two sums of remaining elements
        result += max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
      MaximumumPath path = new MaximumumPath();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [] a1 = new int[m];
        int [] a2 = new int[n];
        for (int i = 0; i < m; i++){
            a1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            a1[i] = scanner.nextInt();
        }
        System.out.println(path.maxPathSum(a1,a2,m,n));
    }
}
