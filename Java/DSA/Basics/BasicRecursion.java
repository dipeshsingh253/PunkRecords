import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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


    // Recursive function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) // Base case: if string has 0 or 1 character, it's a palindrome
            return true;
        else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (firstChar == lastChar) {
                // If the first and last characters are the same, check the substring
                // excluding the first and last characters
                return isPalindrome(str.substring(1, str.length() - 1));
            } else {
                // If the first and last characters are not the same, it's not a palindrome
                return false;
            }
        }
    }


    /**
     * @param n fibonacci number requested
     * @return fibonacci number calculated
     */
    public static int fibonacciNumber(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    /**
     * @param n the fibonacci number
     * @return the result calculated
     * For better efficiency, you could use memoization to store the results of previously calculated Fibonacci numbers, avoiding redundant calculations.
     */
    public static int fibonacciNumberOptimised(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        Map<Integer, Integer> memo = new HashMap<>();

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = fibonacciNumberOptimised(n - 1) + fibonacciNumberOptimised(n - 2);
            memo.put(n, result);
            return result;
        }
    }

}
