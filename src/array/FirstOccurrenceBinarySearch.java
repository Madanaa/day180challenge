package array;

public class FirstOccurrenceBinarySearch {
    // Method to perform binary search for the first occurrence
    public static int firstOccurrenceBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1; // To store the index of the first occurrence

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid; // Store the index as potential first occurrence
                right = mid - 1; // Search in the left half for the first occurrence
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return result;
    }

    // Helper method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the first occurrence binary search
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 8, 10, 12, 14, 16, 18, 20};
        int target = 8;

        System.out.print("Array: ");
        printArray(array);

        int index = firstOccurrenceBinarySearch(array, target);

        if (index != -1) {
            System.out.println("First occurrence of target found at index: " + index);
        } else {
            System.out.println("Target element not found in the array.");
        }
    }
}

