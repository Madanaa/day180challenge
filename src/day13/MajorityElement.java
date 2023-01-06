package day13;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length;i++) {
            array[i] = sc.nextInt();
        }
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < array.length;i++) {
            int count = 0;
            for (int j = 0; i < array.length;i++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }
            if (count > maxCount){
                maxCount = count;

            }
          if (maxCount > n/2) {
              System.out.println(array[index]);
          }
        }
    }
}
