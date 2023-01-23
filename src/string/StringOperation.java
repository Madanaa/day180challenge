package string;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        // create a new Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the string: ");
        int n = scan.nextInt();

        // prompt user for the original string
        System.out.print("Enter the original string: ");
        String s = scan.next();

        // prompt user for the characters to be counted
        System.out.print("Enter the characters to be counted: ");
        String chars = scan.next();

        // count the occurrences of the characters
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < chars.length(); j++) {
                if (s.charAt(i) == chars.charAt(j)) {
                    count++;
                }
            }
        }

        // print the total count
        System.out.println("Total count: " + count);
    }
}