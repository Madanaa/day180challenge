package array2d;

public class Print2dArray {
    public static void main(String[] args) {
        int[][] a = {{1,3,6,6,6},{1,7,8,5},{5,8,6,4}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
