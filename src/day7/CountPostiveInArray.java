package day7;

public class CountPostiveInArray {
    public static int countPositive(int[] a) {
        int i = 0;
        int count = 0;
        while (i < a.length) {
            if (a[i] <= 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a[]={1,8,-3,6};
        System.out.println(countPositive(a));
    }
}
