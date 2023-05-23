package day22;

import java.util.Scanner;

public class TheBlockGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp,r,sum = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum =  (sum *10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("wins");
        }
        else {
            System.out.println("loses");
        }
    }
}
