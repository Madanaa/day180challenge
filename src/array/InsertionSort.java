package array;

public class InsertionSort {
      public static void inserionSort(int a[]) {
          int n = a.length;
          for (int i = 1; i < a.length; i++) {
             int key = a[i];
             int j = i - 1;
              // Humein `key` variable ki value sahi jagah place karna hai,
              // to hum `j` variable se pichhle elements ko ek ek karke check karte hai
              while (j >= 0 && a[j] > key) {

                  // Agar `j` ki value 0 se badi hai aur `j` vaale element `key` se bada hai,
                  // to hum `j+1` vaale element ko `j` vaale element se replace karte hai
                  // Isse `key` ki value ko correct position par shift kar dete hai

                  a[j+1] = a[j];

                 j = j-1;
             }
              // Jab hum loop se bahar aate hai, to `key` variable ki sahi position mil gayi hai
              // To hum `key` ki value ko uski correct position par rakhte hai
             a[j+1] = key;
          }
      }
    public static void main(String[] args) {
       int a[] = {5, 2, 9, 1, 3};
       inserionSort(a);
       for (int i = 0; i < a.length;i++) {
           System.out.println(a[i]);
       }
    }
}
