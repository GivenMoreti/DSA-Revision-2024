package sortingRevision;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = { 32, 3, 56, 12, 16, 6, 7, 1, 0 };
        System.out.println("Before: " + Arrays.toString(nums));
        mergeSort(nums, 0, nums.length - 1);
        System.out.println("After: " + Arrays.toString(nums));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1]; // end - start + 1 is the length of the temp arr
        int i = start;
        int j = mid + 1;
        int k = 0; // start index of temp arr
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
                // i++;
                // k++;
            } else {
                temp[k++] = arr[j++];
                // k++;
                // j++;
            }
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
    }

}
