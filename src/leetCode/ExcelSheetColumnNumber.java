package leetCode;

public class ExcelSheetColumnNumber {
    public static int countColumn(String s) {
        int ans = 0;
        int pow = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int val = (int) c - 65 +1;
            ans +=  val*Math.pow(26,pow);
            pow++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countColumn("A"));
    }
}
