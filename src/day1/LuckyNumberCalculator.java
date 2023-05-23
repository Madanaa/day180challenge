package day1;

public class LuckyNumberCalculator {
    public static void main(String[] args) {
        int[] numbers = {93, 64, 54, 40};

        int firstDigit = numbers[numbers.length - 2] / 100;
        int secondDigit = (numbers[numbers.length - 2] / 10) % 10;
        int thirdDigit = numbers[numbers.length - 2] % 10;

        int[] nextNumbers = new int[8];

        for (int i = 0; i < nextNumbers.length; i++) {
            firstDigit -= 3;
            secondDigit -= 1;

            if (i % 2 == 0) {
                thirdDigit -= 1;
            } else {
                thirdDigit += 1;
            }

            nextNumbers[i] = (firstDigit * 100) + (secondDigit * 10) + thirdDigit;
        }

        // Print the next numbers
        for (int number : nextNumbers) {
            System.out.println(number);
        }
    }
}

