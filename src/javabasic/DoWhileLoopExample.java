package javabasic;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        String correctPassword = "Hello";
        String inputPassword;
        boolean isValid = false;
        do {
            inputPassword = "Hello";
            if (inputPassword.equals(correctPassword)) {
                isValid = true;
                System.out.println("Welcome");
            }
            else {
                System.out.println("Please try again password is wrong");
            }
        }
        while (!isValid);

    }
}
