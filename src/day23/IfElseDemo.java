package day23;

public class IfElseDemo {
    public static void main(String[] args) {

        int age = 32;

        if (age < 18) {
            System.out.println("try next time");

        } else if (age <= 18 && age >= 18) {
            System.out.println("Go for vote");

        } else if (age > 60) {
            System.out.println("Not allowed");

        } else {
            System.out.println("Not");
        }


    }
}
