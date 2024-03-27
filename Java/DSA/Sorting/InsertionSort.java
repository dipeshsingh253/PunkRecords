package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        insertionSort(data);
        System.out.println(Arrays.toString(data));
    }
    static void insertionSort(int[] arr){

        int  size = arr.length;

        for (int i=0;i<size;i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

    }


}
