package BinarySearch;

public class FindXInSortedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9 };

        int x = 9;
        int idx = findXInSortedArrayRecursive(0, arr.length - 1, x, arr);
        int res = findXInSortedArray(arr, x);
        System.out.println(idx + " <===> " + res);
    }

    private static int findXInSortedArrayRecursive(int l, int h, int x, int[] arr) {

        if (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                return findXInSortedArrayRecursive(mid + 1, h, x, arr);
            }
            if (arr[mid] > x) {
                return findXInSortedArrayRecursive(l, mid - 1, x, arr);
            }

        }

        return -1;
    }

    private static int findXInSortedArray(int[] arr, int x) {
        int n = arr.length;
        int h = n - 1;
        int l = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }
}
