package string;

public class VowelOrConsonant {
    public static void CheckVowelOrConsonant(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
    public static boolean isLowerCase(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static boolean isUpperCase(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static void main(String[] args) {
        CheckVowelOrConsonant('e');
    }
}
