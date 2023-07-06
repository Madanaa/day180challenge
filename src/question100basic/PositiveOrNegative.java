package question100basic;

public class PositiveOrNegative {
    public static void positiveOrNegative(int num) {
        if (num > 0) {
            System.out.println(num+ " is Positive.");
        }
         else  if(num < 0) {
            System.out.println(num+ " is Negative.");
        }
         else {
            System.out.println(num+ " is Zero.");
        }
    }
    public static void main(String[] args) {
        int num = -7;
        positiveOrNegative(num);
    }
}
