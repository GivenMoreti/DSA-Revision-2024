public class OrderAgnosticBinSearch {
    public static void main(String[] args) {

        int[] ascArr = { 1, 4, 5, 7, 12, 45, 67 };
        int[] desArr = { 345, 67, 23, 15, 2 };

        int ans = orderAgnosticBinSearch(ascArr, 45);
        System.out.println(ans);

        int ansDec = orderAgnosticBinSearch(desArr, 15);
        System.out.println(ansDec);
    }

    // return -1 if not found
    // find the middle value arr[mid]
    // check whether it's ascending or descending
    // return correct index

    public static int orderAgnosticBinSearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        // check if it is ascending
        boolean isAsc = arr[high] > arr[low];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                // ascending order
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // descending order
                if (target > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }
        return -1;
    }
}
