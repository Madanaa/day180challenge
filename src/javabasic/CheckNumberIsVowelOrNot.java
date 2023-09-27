package javabasic;

public class CheckNumberIsVowelOrNot {
    public static void main(String[] args) {
        char ch = 'A';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch <= 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch <= 'O' || ch == 'U')
        {
            System.out.println(ch + " is Vowel");
        }
        else
        {
            System.out.println(ch + " is Consonant");
        }
    }
}
