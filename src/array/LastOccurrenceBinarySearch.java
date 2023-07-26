package array;

public class LastOccurrenceBinarySearch {
    // Method to perform binary search for the last occurrence
    public static int lastOccurrenceBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1; // To store the index of the last occurrence

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid; // Store the index as potential last occurrence
                left = mid + 1; // Search in the right half for the last occurrence
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

    // Main method to test the last occurrence binary search
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 8, 10, 12, 14, 16, 18, 20};
        int target = 8;

        System.out.print("Array: ");
        printArray(array);

        int index = lastOccurrenceBinarySearch(array, target);

        if (index != -1) {
            System.out.println("Last occurrence of target found at index: " + index);
        } else {
            System.out.println("Target element not found in the array.");
        }
    }
}

