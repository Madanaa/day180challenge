package string;

import java.util.Scanner;

public class Strings_Toggle_Case {
    public static String toggleCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length();i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(toggleCase(s));
    }
}
