package Basics;

public class BinarySearch {


    public static void main(String[] args) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(binarySearch(array,5));
        System.out.println(binarySearchRecursive(array,5,0,array.length-1));
    }

    static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] < target){
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr,int target, int low, int high){

        if(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target)return mid;

            if(arr[mid] < target){
                return binarySearchRecursive(arr,target,mid+1,high);
            }else {
                return binarySearchRecursive(arr,target,low,mid-1);
            }
        }

        return -1;
    }


}
