package sortingRevision;

public class QuickSort {

    public static void main(String[] args) {

    }

    public static int quickSort(int arr[]) {
        
        return quickSort(arr);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;

        while (i <= high) {
            if (arr[i] <= pivot) {
                swap(arr, arr[i], arr[j]);
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
