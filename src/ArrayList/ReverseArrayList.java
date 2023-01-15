package ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        int num = 123456;
        ArrayList<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        int revNum = 0;
        for (int i = 0; i < list.size(); i++) {
            revNum = revNum * 10 + list.get(i);
        }
        System.out.println(revNum);
    }
}
