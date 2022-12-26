package day10;

public class TrappingWater {
    public static int areaOfMax(int[] height) {
        int start = 0;
        int end = height.length-1;
        int result = 0;
        while (start < end) {
            int currMax = (end - start) * Math.min(height[start],height[end]);
            if (height[start] < height[end]){
                start++;
            }
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
