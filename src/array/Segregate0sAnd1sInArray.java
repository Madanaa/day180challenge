package array;

public class Segregate0sAnd1sInArray {
    public static void main(String[] args) {
        int a[] = {7,0,1,0,1,0,1,1,1,0,7,7,7};
        int j = 0;
        for (int i = 0; i < a.length;i++) {
            // if value at index is equal to 0
            if (a[i] == 0) {
                a[j++] = a[i];// [0,0,0,0]
            }

//            if (a[i] == 5) {
//                a[j++] = a[i];// [0,0,0,0]
//            }
        }
        // we have already moved zero, now the remaining values is 1
        while (j < a.length) {
            a[j++] = 1;//[0,0,0,0,1,1,1]
        }
        for (int k = 0; k < a.length;k++) {
            System.out.print(a[k]+" ");
        }
    }
}
