package string;

public class CheckIfHaveSubString {
    public static boolean isSubstring(String s1, String s2){
        if (s1.contains(s2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isSubstring("hello","hi"));
    }
}
