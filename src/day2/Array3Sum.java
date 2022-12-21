package day2;

import java.util.Arrays;
import java.util.HashSet;

public class Array3Sum {
    public static void main(String[] args) {
            int[] a = new int[]{5,7,9,1,2,4,6,8,3};
        Arrays.sort(a);
            int target = 10;
            //HashSet hashMap = new HashSet();


            for(int i = 0; i < 7; ++i) {
                for(int j = i + 1; j < 7; ++j) {
                    for(int k = j + 1; k < 7; ++k) {
                        if (a[i] + a[j] + a[k] == target ) {
                            System.out.println(a[i]+", "+a[j]+" and "+a[k]);
                        }

                       //hashMap.add(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }

        }
}
