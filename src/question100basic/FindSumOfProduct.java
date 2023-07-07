package question100basic;

import java.util.Scanner;

public class FindSumOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sumOfProduct = a * b * c;
        System.out.println("Sum of Product is "+sumOfProduct);
    }
}
