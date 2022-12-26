package collectionsFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(1);
        list.add(5);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        for (int i = 0; i < list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
