package day18;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int []arr = new int[n];//define kiya hai

        for(int i=0;i<n;i++ ) {
            arr[i]=sc.nextInt();// doubt
        }
        display(new int[]{4, 7});//call karate hai function ko

    }
//    public static void add(int a , int b) {
//         int i = a + b;
//        System.out.print(" add "+i);
//    }
    public static void display(int[] arr) {//method banya hai

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
