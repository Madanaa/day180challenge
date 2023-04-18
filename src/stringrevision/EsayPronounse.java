package stringrevision;

import java.util.Scanner;

public class EsayPronounse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int consonantCount = 0;
        for ( char c : s.toCharArray()) {
            if (isVowel(c)) {
                consonantCount = 0;
            }
            else {
                consonantCount++;
                if (consonantCount >= 4) {
                    System.out.println("NO");
                }
            }
        }
        System.out.println("YES");
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
