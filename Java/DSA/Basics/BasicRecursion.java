import java.util.Arrays;

public class BasicRecursion {

    public static void main(String[] args) {
        int n = 5;
        String message = "Who knows the past can predict the future !!!";

        System.out.println("Print 1 to "+n);
        printOneToN(n);

        System.out.println("Print "+n+" to 1");
        printNToOne(n);

        printNTime(n,message);

        int sumOfFirstNNumbers = sumOfFirstNNumbers(n);
        System.out.println("Sum of first N numbers: "+sumOfFirstNNumbers);

        int factorial = factorial(n);
        System.out.println("Factorial of N: "+factorial);

        int[] arr = {1,2,3,4,5};
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void printOneToN(int n){
        if (n == 0){
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }
    static void printNToOne(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }

    static void printNTime(int n,String message){
        if(n == 0) return;
        System.out.println("The message is: "+ message);
        printNTime(n-1,message);
    }

    private static int sumOfFirstNNumbers(int n) {
        if(n==0){
            return 0;
        }
        return n + sumOfFirstNNumbers(n-1);
    }

    static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: When there's only one element or no elements left
        if (start >= end) {
            return;
        }

        // Swap the first and last elements of the subarray
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining subarray
        reverseArray(arr, ++start, --end);
    }

}
