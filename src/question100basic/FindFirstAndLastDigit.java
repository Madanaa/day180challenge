package question100basic;

public class FindFirstAndLastDigit {
    public static void findFD(int n) {
        int firstDigit = 0;
        while (n != 0) {
            firstDigit = n % 10;
          n = n / 10;
        }
        System.out.println(firstDigit);
    }
    public static void findLD(int n) {
        int lastDigit = n % 10;
        System.out.println(lastDigit);
    }
    public static void main(String[] args) {
      findFD(123);
      findLD(123);
    }
}
