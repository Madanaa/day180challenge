package array;

public class FindCommonElementInArray {
    public static void commonElements(int[] a1, int[] a2, int[] a3) {
        for (int i = 0; i < a1.length;i++) {
            for (int j = 0; j < a2.length;j++) {
                for (int k = 0; k < a3.length; k++) {
                    if (a1[i] == a2[j] && a2[j] == a3[k]) {
                        System.out.println(a1[i]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
              int a1[] = {12,6,8,7};
              int a2[] = {1,2,6,3,7};
              int a3[] ={3,5,7,6};
              commonElements(a1,a2,a3);
    }
}
