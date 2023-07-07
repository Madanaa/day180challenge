package string;

public class CheckIfStringIsNull {
    public static boolean check(String str) {
        return str.isBlank();
    }
    public static boolean check1(String str) {
        return str.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(check("  "));
        System.out.println(check1(""));
    }
}
