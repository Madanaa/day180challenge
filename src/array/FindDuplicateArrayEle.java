package array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateArrayEle {
    public static void removeDuplicate(int a[]) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = a.length;
        for (int i = 0; i < a.length-1;i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i],map.get(a[i])+1);
            } else {
                map.put(a[i],1);
            }
        }
        map.forEach((k,v) -> System.out.print(k+" "));
    }

    public static void main(String[] args) {
        int[] a = {5,1,2,6,4,4,5};
        removeDuplicate(a);

    }
}
