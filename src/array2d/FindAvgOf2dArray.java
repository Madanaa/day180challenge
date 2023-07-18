package array2d;

public class FindAvgOf2dArray {
    public static void avgOf2dArray(int[][]a){
        int sum = 0;
        int count = 0;
        for (int[] row : a) {
            for (int i : row) {
                sum = sum + i;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        avgOf2dArray(array);
    }
}
