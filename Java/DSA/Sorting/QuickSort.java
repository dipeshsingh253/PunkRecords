package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int p = partition(arr,l,r);

            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }

//    https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/
    private static int partition(int[] arr, int l, int r) {

        // here the partition will take such in place that all the elements before pivot will be less than it and after pivot will be greater than or equal to it.

        int piv = arr[r];
        int start = l-1;

        for(int j=l;j<r;j++){
            if(arr[j] < piv){
                start++;

                int temp = arr[j];
                arr[j] = arr[start];
                arr[start] = temp;
            }
        }

        int temp = arr[r];
        arr[r] = arr[start+1];
        arr[start+1] = temp;

        return start+1;
    }

}
