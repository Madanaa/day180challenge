package array;

public class InterpolationSearch {
    // Method to perform interpolation search
    public static int interpolationSearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right && target >= array[left] && target <= array[right]) {
            // Calculate the approximate position using interpolation formula
            int pos = left + ((target - array[left]) * (right - left)) / (array[right] - array[left]);

            if (array[pos] == target) {
                return pos; // Target element found at the calculated position
            } else if (array[pos] < target) {
                left = pos + 1; // Search in the right half
            } else {
                right = pos - 1; // Search in the left half
            }
        }

        return -1; // Target element not found in the array
    }

    // Helper method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the interpolation search
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        System.out.print("Array: ");
        printArray(array);

        int index = interpolationSearch(array, target);

        if (index != -1) {
            System.out.println("Target element found at index: " + index);
        } else {
            System.out.println("Target element not found in the array.");
        }
    }
}

