package question100basic;

public class RemoveFirstAndLastDigit {
    // by toString ---
public static void removeFD(int n) {
    int removeFirstDigit = Integer.parseInt(Integer.toString(n).substring(1));
    System.out.println(removeFirstDigit);
}
  public static void removeLD(int n){
    int removeLastDigit = n / 10;
      System.out.println(removeLastDigit);
  }
    public static void main(String[] args) {
        removeFD(123);
        removeLD(123);
    }
}
