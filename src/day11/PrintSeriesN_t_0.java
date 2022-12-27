package day11;

public class PrintSeriesN_t_0 {
    //  Print n, n-3, n-6, n-9, n-12….. Print till the value to be printed is greater than 0.
    public static int  printSeries(int n) {
        int i = n;
        for (i = n; i > 0; i = i - 3) {
            System.out.print(i + " ");
        }
       return i;
    }
    public static void main(String[] args) {
        printSeries(12);
    }
}
