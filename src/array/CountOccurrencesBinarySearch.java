package array;

public class CountOccurrencesBinarySearch {
    // Method to perform binary search for counting occurrences
    public static int countOccurrencesBinarySearch(int[] array, int target) {
        int firstOccurrence = findFirstOccurrence(array, target);
        if (firstOccurrence == -1) {
            return 0; // Target element not found, return 0 occurrences
        }

        int lastOccurrence = findLastOccurrence(array, target);

        return lastOccurrence - firstOccurrence + 1;
    }

    // Method to find the first occurrence of the target element
    public static int findFirstOccurrence(int[] array, int target) {
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

    // Method to find the last occurrence of the target element
    public static int findLastOccurrence(int[] array, int target) {
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

    // Main method to test counting occurrences using binary search
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 8, 8, 10, 12, 14, 16, 18, 20};
        int target = 8;

        System.out.print("Array: ");
        printArray(array);

        int occurrences = countOccurrencesBinarySearch(array, target);

        System.out.println("Number of occurrences of target: " + occurrences);
    }
}

