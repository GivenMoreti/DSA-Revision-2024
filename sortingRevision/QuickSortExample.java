package sortingRevision;

import java.util.Arrays;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] nums = { 32, 1, 0, 96, 33, 4 };
        System.out.println(nums.length);
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;

        while (i <= high) {
            if (arr[i] <= pivot) {
                // swap(arr, arr[i], arr[j]);

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
            i++;
        }
        return j - 1;
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
