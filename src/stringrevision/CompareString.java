package stringrevision;

public class CompareString {
    public static void main(String[] args) {
        String s1 = "kamal";
        String s2 = "komal";
        System.out.println(s1.compareTo(s2));

    }
    public static int compareTo(String s1,String s2 ) {
        if(s1==s2) {
            return 0;
        }
        for(int i=0; i<Math.min(s1.length(), s2.length());i++){

            if(s1.charAt(i)!= s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }

        }
        return s1.length()-s2.length();

    }
}
