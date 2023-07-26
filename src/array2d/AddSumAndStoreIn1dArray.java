package array2d;

public class AddSumAndStoreIn1dArray {
    public static void aadSumOf2dArraySotreIn1dAarray(int[][]a) {
        int rows = a.length;
        int columns = a[0].length;

        int[] rowSums = new int[rows];

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += a[i][j];
            }
            rowSums[i] = sum;
        }

        for (int i = 0; i < rows; i++) {
            System.out.println("Sum of row " + (i + 1) + ": " + rowSums[i]);
        }

    }
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        aadSumOf2dArraySotreIn1dAarray(array);
    }
}
