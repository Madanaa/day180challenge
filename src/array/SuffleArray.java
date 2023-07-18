package array;

public class SuffleArray {
    public static int[] shuffle(int[] nums, int n)
    {
        int[] ans = new int[nums.length];
        int k=0;
        int j=0;
        for(int i=0; i<nums.length ;i++)
        {

            if(i==0 || i % 2==0)
            {
                ans[k] = nums[j];
                k++;
                j++;
            }
            else
            {
                ans[k] = nums[n];
                n++;
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     int a[] = {1,2,3,4,5};
     shuffle(a,a.length);
     for (int i = 0; i < a.length; i++) {
         System.out.print(a[i]+" ");
     }
    }
}
