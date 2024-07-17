import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int getMax(int[] arr, int end) {

        int max = 0; // assume max element is at the first index

        for (int i = 1; i <= end; i++) {
            // if the current element is greater than the assumed max element
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // last index
            int last = arr.length - i - 1;
            // get max
            int maxIndex = getMax(arr, last);
            // swap
            swap(arr, maxIndex, last);
        }
    }

}
