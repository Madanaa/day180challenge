package array2d;

public class Transpose2dArray {
    public static void transpose2dArray(int[][]a) {
        int row = a.length;
        int columns = a[0].length;
        int[][] transposeArray = new int[columns][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                transposeArray[j][i] = a[j][i];
            }
        }
    }
    public static void main(String[] args) {

    }
}
