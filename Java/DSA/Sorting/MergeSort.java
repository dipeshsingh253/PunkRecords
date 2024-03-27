package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int l,int r){
        if(l < r){
            int m = l + (r-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    static void merge(int[] arr,int l,int m,int r){

        int n1 = m-l+1;
        int n2 = r-m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(arr,l,left,0,n1);
        System.arraycopy(arr,m+1,right,0,n2);

        int i = 0, j = 0, k = l;

        while (i < n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j<n2){
            arr[k] = right[j];
            k++;
            j++;
        }

    }

}
