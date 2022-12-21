package day2;

import java.util.Arrays;

public class SalaryExcluding {
    public static double salary(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length;i++) {
            sum = sum + salary[i];
        }
        return sum/(salary.length-2);
    }

    public static void main(String[] args) {
        int a[] = {4000,3000,1000,2000};
        System.out.println(salary(a));
    }
}
