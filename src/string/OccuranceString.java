package string;

public class OccuranceString {
    public static void check(String str) {
        int count = 0;
        char c = 'e';
        for (int i = 0; i < str.length(); i++) {

                count++;

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        check("hello");
    }
}
