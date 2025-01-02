package Recursion;

public class RecursionExample {
    public static void main(String[] args) {
        // System.out.println(fact(5));

        int[] nums = { 5, 2, 7, 8, 1, 9 };
        System.out.println(method(nums, nums.length));
    }

    // example 2

    public static int method(int[] arr, int i) {
        if (i == 0)
            return i;
        if (arr[i - 1] < arr[0]) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[0];
            arr[0] = temp;
        }
        return method(arr, i - 1);

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
