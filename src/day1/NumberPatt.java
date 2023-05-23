package day1;

import java.util.ArrayList;
import java.util.List;

public class NumberPatt {
    public static void main(String[] args) {
        int limit = 10; // Change this value to set the limit
        List<Integer> luckyNumbers = findLuckyNumbers(limit);

        System.out.println("Lucky numbers up to " + limit + ":");
        for (int number : luckyNumbers) {
            System.out.print(number+" ");
        }
    }

    public static List<Integer> findLuckyNumbers(int limit) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> luckyNumbers = new ArrayList<>();

        // Initialize the numbers list with all integers from 1 to limit
        for (int i = 1; i <= limit; i++) {
            numbers.add(i);
        }

        int index = 1;
        while (index < numbers.size()) {
            // Remove every index-th element from the list
            for (int i = index; i < numbers.size(); i += index) {
                numbers.remove(i);
            }
            index++;
        }

        // The remaining numbers in the list are lucky numbers
        luckyNumbers.addAll(numbers);
        return luckyNumbers;
    }
}
