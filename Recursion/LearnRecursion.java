public class LearnRecursion {
    public static void main(String[] args) {
        print(4);

        int[] myarr = { 2, 3, 5 };

        System.out.println(sum(myarr));
        System.out.println(sum(myarr, myarr.length));
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
