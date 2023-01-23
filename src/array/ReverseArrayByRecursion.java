package array;

public class ReverseArrayByRecursion {
    static void reverseArray(int[]a, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reverseArray(a,start+1,end-1);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        reverseArray(a,0,a.length-1);
        for (int i = 0; i < a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
