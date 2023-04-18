package stringrevision;

import java.util.Locale;

public class StringFunction {
    public static void main(String[] args) {
        String str = "Hellooo";
        String str1 = "Hell";
        int s = str.compareTo(str1);
        System.out.println(str.charAt(0));
        // convert all char in uppercase
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.indexOf('e'));
        System.out.println(str.compareTo(str1));

        if (s == 0) {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
