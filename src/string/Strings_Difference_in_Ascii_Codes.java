package string;

public class Strings_Difference_in_Ascii_Codes {
    public static String insertDifference(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int diff = (int)s.charAt(i) - (int)s.charAt(i-1);
            sb.append(diff);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "acb";
        System.out.println(insertDifference(input)); // Outputs: "a2c-1b"
    }
}
