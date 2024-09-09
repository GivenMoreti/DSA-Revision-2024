public class LearnRecursion {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        System.out.println(method1(list, 0));

    }

    public static String method1(int[] val, int i) {
        if (i == val.length)
            return "3";
        else
            return val[i] + method1(val, i + 1) + val[i];
    }

    // print nnumbers
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n); // descending order
        print(n - 1);

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sum(int[] arr, int n) {
        if (n <= 0)
            return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

}
