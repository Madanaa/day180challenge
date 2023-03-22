package stringrevision;

public class WordleGues {
    public static void main(String[] args) {
        String s = "ABCDE";
        String t = "EDCBA";
        String m = "";
        for (int i = 0; i < 5; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                m += "G";
            } else {
                m += "B";
            }
        }

        for (int i = 0; i < 5; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                m += "G";
            } else {
                m +="B";
            }
        }

        System.out.println(m); // print output string
    }
}
