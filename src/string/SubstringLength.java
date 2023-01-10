package string;

public class SubstringLength {
    static void subString(String s) {
        for (int i = 1; i <= s.length();i++) {
            for (int j = i; j <= s.length();j++) {
                int subS = j - i;
                System.out.println(s.substring(subS,j));
            }
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        subString(s);
    }
}
