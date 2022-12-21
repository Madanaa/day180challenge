package day6;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquareArray {
    public static void sortedSquare(int[] a) {
        int newArray [] = new int[a.length];
         int start = 0;
         int end = a.length-1;
         for (int i = end; i >= 0; i--) {
             if (Math.abs(a[start]) > Math.abs(a[end])) {
                 newArray[i] = a[start] * a[start];
                 start++;
             }
             else {
                 newArray[i] = a[end] * a[end];
                 end--;
             }
         }
         for (int i = 0; i < newArray.length;i++) {
             System.out.print(newArray[i]+" ");
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =  {4,5,2,1};

        sortedSquare(a);
//        for (int i = 0; i < a.length;i++) {
//            System.out.print(a[i]+" ");
//        }
    }
}
