package array;

public class SmallestMissingPositive {
    // Method to swap elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Method to find the smallest missing positive integer
    public static int findSmallestMissingPositive(int[] nums) {
        int n = nums.length;

        // Separate positive and non-positive numbers
        int posIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                swap(nums, i, posIndex);
                posIndex++;
            }
        }

        // Ignore non-positive numbers and mark positive numbers at their correct positions
        for (int i = posIndex; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n - posIndex) {
                nums[posIndex + num - 1] = -Math.abs(nums[posIndex + num - 1]);
            }
        }

        // Find the first positive number that is not marked
        for (int i = posIndex; i < n; i++) {
            if (nums[i] > 0) {
                return i - posIndex + 1;
            }
        }

        return n - posIndex + 1; // All numbers from 1 to (n - posIndex) are present
    }

    // Helper method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test finding the smallest missing positive integer
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.print("Array: ");
        printArray(nums);

        int smallestMissing = findSmallestMissingPositive(nums);
        System.out.println("Smallest missing positive integer: " + smallestMissing);
    }
}

