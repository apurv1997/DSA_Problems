
// Find First and Last Occurance of Element in an Sorted Array

public class FindFirstAndLast {
    public static int first(int arr[], int x, int n) {
        int low = 0, high = n - 1, result = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > x)
                high = mid - 1;
            else if(arr[mid] < x)
                low = mid + 1;
            else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    public static int last(int arr[], int x, int n) {
        int low = 0, high = n - 1, result = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > x)
                high = mid - 1;
            else if(arr[mid] < x)
                low = mid + 1;
            else {
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10, 18, 20};
        int n = arr.length;
        int x = 10;
        System.out.println("First Occurance = " + first(arr, x, n));
        System.out.println("Last Occurance = " + last(arr, x, n));

    }
}
