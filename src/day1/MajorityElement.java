package day1;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a [] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length;j++){
                if (a[i] == a[j])
                    count++;
            }
            if (count > maxCount){
                maxCount = count;
                index = i;
            }

        }
        if (maxCount > n/ 2){
            System.out.println(a[index]);
        }
    }
}
