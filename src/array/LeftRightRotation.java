package array;

public class LeftRightRotation {
    public static int[] leftRotation(int[] a,int n, int numOfRotation) {
        for (int i = 0; i < numOfRotation; i++) {
            int temp = a[0];
            for (int j = 0; j < n-1; j++) {
                a[j] = a[j+1];
            }
            a[n-1] = temp;
        }
        return a;
    }
    public static int[] rightRotation(int[] a, int n, int numOfRotation) {
        for (int i = 0; i < numOfRotation; i++) {
            int temp = a[n-1];
            for (int j =n-1 ; j > 0; j--) {
                a[j] = a[j-1];
            }
            a[0] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
       rightRotation(a,a.length,2);
       for (int i = 0; i < a.length; i++) {
           System.out.print(a[i]+" ");
       }
    }
}
