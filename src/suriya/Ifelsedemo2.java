package suriya;

public class Ifelsedemo2 {
    public static void main(String[] args) {
        int a = 5498846;
        int b = 1654961864;
        int c = 547749848;
        if (a<b && a<c)
        System.out.println(a);

        else if (b<a && b<c)
            System.out.println(b);
        else if (c<a && c<b)
            System.out.println(c);
    }
}
