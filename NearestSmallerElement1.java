/*
 * Program to find Next Smaller Element to Left for all Array elements in same order as output
 * */


import java.util.Stack;

public class NearestSmallerElement1 {
    public static void printNGE(int arr[], int n){
        Stack<Integer> s = new Stack<>();
        int arr1[] = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            if(s.empty()){
                arr1[i] = -1;
            } else {
                arr1[i] = s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ---> " + arr1[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 2 ,10, 8};
        int n = arr.length;
        printNGE(arr, n);
    }
}