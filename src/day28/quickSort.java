package day28;

public class quickSort {
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;

        for(int i = st+1; i < end; i++){
            if(arr[i] <= pivot)
                count++;
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);

        int i = st;
        int j = end;
        //elements lesser or equal left, greater -----> right side of pivot
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] < pivot)
                i++;
            while(arr[j] > pivot )
                j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort1(int[] arr, int st, int end){
        if(st > end ) return;
        int pi = partition(arr, st, end);
        quickSort1(arr, st, pi-1);
        quickSort1(arr, pi+1, end);

    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args){
        int[] arr = {6, 3, 1, 5, 4};
        System.out.println("Arrays before sorting");
        displayArr(arr);
        System.out.println();
        quickSort1(arr, 0, arr.length);
        System.out.println("Arrays after sorting");
        displayArr(arr);
    }
}
