package twopointer;

public class FindPairOfSum {
    public static int[] findPairWithTargetSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left,right};
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};
        int target = 14;

        int[] result = findPairWithTargetSum(nums, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Pair not found.");
        } else {
            System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
        }
    }
}
