package rivision;

public class SumOfEvenOdd {
    static void sumOfEvenOdd(int n) {
        int sumO= 0,sumE=0;
        for (int i = 0; i <= n; i++) {
             if (i % 2 == 0) {
              sumE = sumE + i;
             }
           else {
               sumO = sumO + i;
      }
        }
        System.out.print(sumE+" "+sumO);
    }
    public static void main(String[] args) {
        sumOfEvenOdd(10);
//        int n = 10;
//        int position = 1;
//        int even = 0;
//
//        int odd = 0;
//        for(int i = 0; i <= n; i++) {
//            int rem = n % 10;
//            n /= 10;
//            if (position % 2 == 1) {
//                odd += rem;
//            } else {
//                even += rem;
//            }
//        }
//
//        System.out.println(odd);
//        System.out.println(even);
    }
}
