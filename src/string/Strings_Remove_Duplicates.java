package string;

public class Strings_Remove_Duplicates {
    public static String removeConsecutiveDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        char previousChar = '\0';
        for (char c : s.toCharArray()) {
            if (c != previousChar) {
                sb.append(c);
            }
            previousChar = c;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabccba";
        String output = removeConsecutiveDuplicates(input);
        System.out.println(output);
    }
}
