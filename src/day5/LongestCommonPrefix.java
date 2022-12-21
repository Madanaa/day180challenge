package day5;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String [] str) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);
        // get the first and last string
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();
        for (int i = 0; i < first.length;i++) {
            if (first[i] != last[i])
                break;
                result.append(first[i]);

        }
        return result.toString();
    }
    public static void main(String[] args) {
      String [] s = {"al","alv","alvc"};
        System.out.println(longestCommonPrefix(s));
    }
}
