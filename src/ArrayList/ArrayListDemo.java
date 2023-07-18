package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1");
       list.add("2");
       list.add("3");

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for ( Object i : list) {
            System.out.println(i);
        }
        list.remove("1");
        System.out.println(list);

    }
}
