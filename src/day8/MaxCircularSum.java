package day8;

import java.util.Scanner;

public class MaxCircularSum {
    public static int max_CircularSum_(int array[], int n)
    {
        // Corner Case
        if (n == 1)
            return array[0];

        // Initialize sum variable which store total sum of
        // the array.
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Initialize every variable with first value of
        // array.
        int currMax = array[0], max = array[0],
                currMin = array[0], min = array[0];

        // Concept of Kadane's Algorithm
        for (int i = 1; i < n; i++)
        {

            // Kadane's Algorithm to find Maximum subarray
            // sum.
            currMax = Math.max(currMax + array[i], array[i]);
            max = Math.max(max, currMax);

            // Kadane's Algorithm to find Minimum subarray
            // sum.
            currMin = Math.min(currMin + array[i], array[i]);
            min = Math.min(min, currMin);
        }
        if (min == sum) {
            return max;
        }

        // returning the maximum value
        return Math.max(max, sum - min);
    }

    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
     int array[] = { 11, 10, -20, 5, -3, -5, 8, -13, 10 };

        System.out.println(max_CircularSum_(array, array.length));
    }
}
