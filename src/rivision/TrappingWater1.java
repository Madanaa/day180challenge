package rivision;

public class TrappingWater1 {
    static int trappingWater(int[] a) {
        int result = 0;
        for (int i = 1; i < a.length-1;i++) {
            int left = a[i];
            for ( left = 0; left < i; left++) {
                left = Math.max(left,a[i]);
            }
            int right = a[i];
            for (int j = i+1; j < a.length;j++) {
                right = Math.max(right,a[j]);
            }
            result = result + Math.min(left,right)-a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingWater(a));
    }
}
