package day10;

public class ContainerWithMostWater {
    /*
 You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
     */
    public static int areaOfMax(int[] height) {
        int start = 0;
        int end = height.length-1;
        int result = 0;
        while (start < end) {
            int currMax = (end - start) * Math.min(height[start],height[end]);
            if (height[start] < height[end]){
                start++;
            }
            else
            {
                end--;
            }
            result = Math.max(result,currMax);
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(areaOfMax(a));
    }
}
