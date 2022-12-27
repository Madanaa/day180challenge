package day11;
import java.util.*;
public class RverserArray {



        public static void main(String[] args) {
            // TODO Auto-generated method stu
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long []arr= new long[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Reverse(arr);
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
        }
        public static void Reverse(long[] arr) {
            int i =0;
            int j= arr.length-1;
            while(i<j) {
                long  temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

}
