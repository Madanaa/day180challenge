package day1;

public class PaaternSe {

    public static int getNextNumber(int[] pattern) {
        int lastPosition = pattern.length + 1;
        int firstDigit = lastPosition;
        int secondDigit = firstDigit * firstDigit;
        int thirdDigit = firstDigit - 2;

        return Integer.parseInt(Integer.toString(firstDigit) +
                String.format("%02d", secondDigit) +
                String.format("%02d", thirdDigit));
    }
        public static void main(String[] args) {
            int[] pattern = { 64, 9, 80, 78 };
            int nextNumber = getNextNumber(pattern);
            System.out.println("Next number in the pattern: " + nextNumber);
        }
    }

