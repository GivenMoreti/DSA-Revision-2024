import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 14, 21, 67 };
        int[] arr2 = { 1, 2, 3, 4 };
        System.out.println(maxElement(arr));
        System.out.println(maxRange(arr, 1, 4));

        reverseArr(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static int maxElement(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

    public static int maxRange(int[] arr, int index1, int index2) {
        int max = arr[index1];

        for (int i = index1; i <= index2; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int num1, int num2) {

        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }

}
