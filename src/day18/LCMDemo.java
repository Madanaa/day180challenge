package day18;

public class LCMDemo {
    public static void main(String[] args) {
        System.out.println(lcm(15,25));
    }
    //4,6 ---> 12
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd( b % a, a);//4,6--2--6
    }
    static int lcm(int a, int b) {
        return (a/gcd(a,b)) * b; // 15/ 5 * 25 --->
    }


}
