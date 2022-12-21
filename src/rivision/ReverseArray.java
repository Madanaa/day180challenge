package rivision;

import java.util.Scanner;

public class ReverseArray {
    public static void printArray(int[] a, int n) {
            int start = n + 1;

            for(int end = a.length - 1; start < end; --end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                ++start;
            }

            int[] var8 = a;
            int var5 = a.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                int p = var8[var6];
                System.out.print("" + p + " ");
            }

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            printArray(a, 1);
        }
    }

