package day7;

public class TwoPointer {
    public static int[] twoPointer(int a[]) {
        int temp = 0;
        int i = 1;
        int j = a.length-1;
        while (i < j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        twoPointer(a);
        for (int i = 0; i < a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
