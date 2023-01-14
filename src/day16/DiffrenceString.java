package day16;

import java.util.Scanner;

public class DiffrenceString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int a=0;
        int b =1;
        int c = 1;
        if(str.length()>=2 && str.length()<=1000){
            for(int i =1;i<=str.length()-1;i++){
                int as = ((int)(sb.charAt(b)))-((int)(sb.charAt(a)));
                sb = sb.insert(c, as);
                if(as>=0){
                    a = a+2;
                    b = b+2;
                    c = c+2;
                }
                else{
                    a =a+3;
                    b =b+3;
                    c = c+3;
                }
            }
            System.out.println(sb);
        }
    }
}
