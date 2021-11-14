
// Search an element in reverse sorted array

import java.sql.SQLOutput;

public class ReverseSortedArray {
    public static int binarySearch(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(x == arr[mid]) return mid;
            else if(x < arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {20, 17, 15, 14, 13, 12, 10, 9, 8, 4};
        int x = 17;
        System.out.println(binarySearch(arr, x));
    }
}
