package day2;

import java.util.Scanner;

public class ReverseA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, x;
        int tot = scan.nextInt();
        int[] arr = new int[tot];
        for(i=0; i<tot; i++){
            arr[i] = scan.nextInt();
        }
        j = tot-1;
        for(i=j; i>=0;i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}


