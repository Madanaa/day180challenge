package day12;

public class CalculateFirstSum {
    public static void sumOfOddEven(int n) {
        int sumO = 0,sumE = 0;
        for (int i = 1; i <= n * 2;i++) {
            if (i % 2 == 0) {
                sumE = sumE + i;
            }else {
                sumO = sumO + i;
            }
        }
        System.out.println(sumE+" "+sumO);
    }

    public static void main(String[] args) {
        sumOfOddEven(10);
    }
}
