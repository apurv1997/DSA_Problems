/*
* Move all negative numbers to beginning and positive to end with constant extra space
*Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
* */

/*
* public class Rearrange {
    static void rearrange(int arr[], int n) {
        int j = 0, temp;

        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                if(i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;

        rearrange(arr, n);
        printArray(arr, n);
    }
}
* */

// Two Pointer Approach:

class Rearrange {
    static void rearrange(int[] arr, int left, int right) {
        while(left <= right){
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else {
                left++;
                right--;
            }

        }
    }

    static void printArray(int arr[], int right){
        for (int i=0; i<= right; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, 11};
        int arr_size = arr.length;

        rearrange(arr, 0, arr_size-1);
        printArray(arr, arr_size-1);
    }
}