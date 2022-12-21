package rivision;

public class TrappingWater {
    static int trappingWater(int[] a, int n) {
        int result = 0;

        for(int i = 1; i < n - 1; ++i) {
            int left = a[i];

            //int right;
            for(left = 0; left < i; ++left) {
                left = Math.max(left, a[left]);
            }

            int right = a[i];

            for(int j = i + 1; j < n; ++j) {
                right = Math.max(right, a[j]);
            }

            result = result + Math.min(left, right) - a[i];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
