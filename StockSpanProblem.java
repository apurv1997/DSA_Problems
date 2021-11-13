import java.util.*;

public class StockSpanProblem {
    public static void calculateSpan(int price[], int n, int s[]) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            if(st.empty())
                s[i] = i + 1;
            else {
                s[i] = i - st.peek();
            }static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
             st.push(i);
        }

    }
    public static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] s = new int[n];

        calculateSpan(price, n, s);
        printArray(s);
    }
}
