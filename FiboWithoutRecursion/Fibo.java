package FiboWithoutRecursion;

import java.util.ArrayList;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(genNums(null, 0, 10));

    }

    public static int genNums(int[] arr, int start, int end) {
        while (start <= end) {

            if (start < 0) {
                return 0;
            }
            for (int i = start; i < arr.length;) {
                // end is a second number in a way
                return arr[i] + arr[i - 1];
            }

            start++;
        }
        return 0;

    }
}
