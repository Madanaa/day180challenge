package array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairDemo1 {
    public static int pair(List<Integer> arr, int k ) {
        Set<Integer> numSet = new HashSet<>(arr);
        int count = 0;
        for (int num : arr) {
            if (numSet.contains(num+k)) {
                count++;
            }
            //numSet.remove(num);
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        int k = 1;
        int result = pair(list,k);
        System.out.println(result);
    }
}
