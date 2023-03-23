package stringrevision;

import java.util.Scanner;

public class MarioandtheBrokenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // length of string
        int n = sc.nextInt();
        // string
        String s = sc.next();
        // check if the two halves are equal regardless of order
        if (n % 2 == 0 && s.substring(0,n/2).equals(s.substring(n/2))){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
