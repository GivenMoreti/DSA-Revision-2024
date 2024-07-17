import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] myArr = { 7, 8, 2, 5, 1, 5 };
        bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    public static void bubbleSort(int[] arr) {
        // run the steps n - 1 times, no need to swap the last element
        for (int i = 0; i < arr.length; i++) {
            // for each item max item will come at the end hence reducing the items to be
            // sorted
            // hence arr.length - i
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    // swap the elements

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

}
