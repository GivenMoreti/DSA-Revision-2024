import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 34, 5, 1, 5, 36 };

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) { // second is less than first [4,1]
                    // swap
                    // SelectionSort.swap(arr, j, j - 1); still works
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
