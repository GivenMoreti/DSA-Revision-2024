public class RecursionEx {
    public static void main(String[] args) {

        // print(4);
        // System.out.println(FiboNums(10));
        // System.out.println(addNums(5));
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println("Sum: " + sum(arr, arr.length)); // Output: Sum: 30

    }

    public static int sum(int[] array, int n) {
        // Base case: if the array has no more elements, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: sum of current element and sum of remaining elements
        return array[n - 1] + sum(array, n - 1);
    }

    static void print(int n) {
        // base case
        if (n >= 5) {
            return;
        }
        System.out.print(n);
        // function call
        print(n + 1);
    }

    static int FiboNums(int n) {
        if (n < 2) {
            return n;
        }

        return FiboNums(n - 1) + FiboNums(n - 2);
    }

    static int addNums(int n) {
        if (n > 0) {
            return n + addNums(n - 1);
        } else {
            return 0;
        }
    }

}
