package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        // Step 1: Create an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        // Step 2: Print out the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Step 3: Call the reverseArray method
        reverseArray(arr);

        // Step 4: Print out the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {

        // Step 1: Initialize two pointers, one at the start of the array and one at the end
        int start = 0;
        int end = arr.length - 1;

        // Step 2: Use a while loop to iterate through the array
        while (start < end) {

            // Step 3: Swap the elements at the start and end pointers
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Step 4: Move the pointers to the next position
            start++;
            end--;
        }
    }
}