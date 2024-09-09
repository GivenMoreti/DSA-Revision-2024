package sortingRevision;
import java.util.Arrays;

public class BubbleSortEx {
    public static void main(String[] args) {
        int[] nums = { 99, 4, 2, 11, 3 };
        System.out.println("Length: " + nums.length);
        System.out.println("Before sorting: " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // swap(arr[j], arr[j + 1]);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

    }
}
