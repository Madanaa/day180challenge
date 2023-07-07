package string;

public class StringIsEqualOrNot {
    public static void areEqual(String s1, String s2) {
        if (s1.equals(s2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
       areEqual("Hi","Hi");
    }
}
