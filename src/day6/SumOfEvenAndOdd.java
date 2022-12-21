package day6;

public class SumOfEvenAndOdd {
    public static void sumOfEO(int n) {
        int sumE = 0;
        int sumO = 0;
        for (int i = 0; i <= n; i= i+2){
            sumE = sumE + i;
        }
        for (int i = 1; i <= n; i = i + 2) {
            sumO = sumO + i;
        }
        System.out.print(sumE+" "+sumO);
    }

    public static void main(String[] args) {
        sumOfEO(5);
    }
}
