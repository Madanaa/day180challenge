package day14;

import java.util.*;

public class MajorityElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int[] array = {1, 2, 3, 3};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }

        int majorityElement = findMajorityElement(array);
        System.out.println(majorityElement);
    }

    public static int findMajorityElement(int[] array) {
        Map<Integer, Integer> elementCounts = new HashMap<>();
        for (int element : array) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }

        int majorityElement = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : elementCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                majorityElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return majorityElement;
    }
}
