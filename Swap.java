import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 43, 2, 5, 6 };

        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int index1, int index2) {
        if ((index1 < 0 || index1 > arr.length) || (index2 < 0 || index2 > arr.length)) {
            throw new IndexOutOfBoundsException("Size :" + arr.length + " index1: " + index1 + " Index2:" + index2);
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
