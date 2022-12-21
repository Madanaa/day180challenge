package day6;

public class SumOfEvenOdd {
    public static void sumOfEo(int a[]) {
        int sumE = 0,sumO = 0;
        for (int i = 0; i < a.length;i++) {
            if (a[i] % 2 == 0) {
                sumE += a[i];
            }
            else {
                sumO += a[i];
            }
        }
        System.out.print(sumE+" "+sumO);
    }
    public static void main(String[] args) {
        int a[] = {2,4,6,7,3};
        sumOfEo(a);
    }
}
