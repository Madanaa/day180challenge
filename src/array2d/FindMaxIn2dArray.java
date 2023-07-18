package array2d;

public class FindMaxIn2dArray {
    public static void maxElement(int[][]a) {
        int max = a[0][0];
        for (int[] row : a) {
            for (int i : row) {
                if (max < i) {
                    max = i;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        maxElement(array);
    }
}
