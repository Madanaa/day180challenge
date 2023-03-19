package Array20ProblemsForBegainner;

// Write a program to print the elements of an array in reverse order.
// ex.. input ---> {1,2,3,4,5} ---> {5,4,3,2,1}
public class ReverseArray {
    public static int[] reverseArray(int[] a) {
        // Initialize the start and end indices of the array
        int start = 0;
        int end = a.length - 1;

        // Use a while loop to swap elements until the start and end indices meet in the middle
        while (start < end) {
            // Swap the elements at the start and end indices
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            // Move the start and end indices closer to the middle of the array
            start++;
            end--;
        }

        // Return the reversed array
        return a;
    }

    public static void main(String[] args) {
        // Initialize an array of integers
        int a[] = {1, 2, 3, 4, 5};

        // Reverse the array using the reverseArray method
        reverseArray(a);

        // Print the reversed array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}