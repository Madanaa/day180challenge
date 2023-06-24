package contest.c1;

public class PossiableOrNot {
    public static boolean findBitwiseAndSubsequence(int a[], int b) {
        int n = a.length;
        boolean[] dp = new boolean[b+1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = b; j >= a[i]; j--) {
                dp[j] |= dp[j-a[i]];
            }
        }
        return dp[b];
    }
    public static void main(String[] args) {
     int a[] = {5,4,7,4};
     int b = 5;
        System.out.println(findBitwiseAndSubsequence(a,b));
    }
}
