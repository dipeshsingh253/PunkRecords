package Sorting;

import java.util.Arrays;

/**
 * Resources : [Programiz selection sort](https://www.programiz.com/dsa/selection-sort)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] data = { 20, 12, 10, 15, 2 };
        selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }


    static void selectionSort(int[] arr){

        int n = arr.length;

        for(int i=0;i<n;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

    }

}
