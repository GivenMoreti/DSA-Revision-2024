package sortingRevision;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 12, 2, 5 };
        System.out.println("Before: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("After: " + Arrays.toString(nums));
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
