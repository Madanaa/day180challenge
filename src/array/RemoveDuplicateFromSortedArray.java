package array;

public class RemoveDuplicateFromSortedArray {
    public static int removeD(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length;j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 5, 6};
        int newLength = removeD(nums);
        System.out.println("New length: " + newLength); // Output: 6
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
// Output: 1 2 3 4 5 6

    }
}
