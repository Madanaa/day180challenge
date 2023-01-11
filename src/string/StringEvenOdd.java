package string;

import java.util.Scanner;

public class StringEvenOdd {
    public static String replaceChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length;i++) {
            if (i % 2 == 0) {
                chars[i] = (char) (chars[i]+1);
            }
            else {
                chars[i] = (char) (chars[i]-1);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(replaceChar(s));
    }
}
