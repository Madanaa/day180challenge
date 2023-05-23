package day1;

public class GetDigi {
    public static void main(String[] args) {
        int[] sequence = {93, 64, 54, 40};
        int[] nextNumbers = generateNextNumbers(sequence, 8);

        // Printing the next numbers
        for (int number : nextNumbers) {
            System.out.print(number + " ");
        }
    }

    public static int[] generateNextNumbers(int[] sequence, int count) {
        int[] nextNumbers = new int[count];

        // Adding the given sequence to the nextNumbers array
        for (int i = 0; i < sequence.length; i++) {
            nextNumbers[i] = sequence[i];
        }

        // Generating the remaining numbers based on the pattern
        for (int i = sequence.length; i < count; i++) {
            int lastNumber = nextNumbers[i - 1];
            int nextNumber = 0;

            if (i % 3 == 0) {
                nextNumber = lastNumber / 10;
            } else if (i % 3 == 1) {
                nextNumber = lastNumber % 10 - 1;
            } else {
                nextNumber = lastNumber % 10 + 1;
            }

            nextNumbers[i] = nextNumber;
        }

        return nextNumbers;
    }
}
