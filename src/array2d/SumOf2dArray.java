package array2d;

public class SumOf2dArray {
    public static void sumOf2DArray(int[][] a) {
        int sum = 0;
        for (int row[] : a ) {
            for (int e : row) {
                sum = sum + e;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sumOf2DArray(array);
    }
}
