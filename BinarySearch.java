public class BinarySearch {
    public static void main(String[] args) {

        int target = 89;
        // initialize the array
        int[] arr = {1,2,4,6,13,67,89,902,1003};

        // populate the array
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = i;
        // }

        // implement the binary search
        int index = binSearch(arr, target);
        if (index == -1) {
            System.out.println("element does not exist");
        } else {
            System.out.println("Element found at index " + index);
        }

    }

    public static int binSearch(int[] arr, int target) {

        int low = 0;
        int end = arr.length - 1;

        while (low <= end) {
            int middle = low + (end - low) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                low = middle + 1;
            }

        }

        return -1;
    }
}