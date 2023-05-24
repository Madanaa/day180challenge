package array;

public class PairSum {
    // this brute force approach
    /*
    Ismein humein array mein har ek element ko doosre element ke saath compare karna hai aur unka difference check karna hai.
    Agar difference target value ke barabar hai, toh hum ek pair consider karte hain.
    (1, 2) ka difference hai 1
   (2, 3) ka difference hai 1
   (3, 4) ka difference hai 1
     */
    public static int pairSum(int a[], int k) {
        int count = 0;
        for (int i = 0; i < a.length;i++) {
            for (int j = i + 1; j < a.length;j++) {
                if (Math.abs(a[i] - a[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int k = 1;
        System.out.println(pairSum(a,k));
    }
}
