import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // input
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = in.nextInt();
            }

        }
        in.close();
        // output

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // using Arrays.toString(arr) which is same as 2d loop
        System.out.println("using Arrays.toString(arr)");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // using enhnaced for loop to get the same outcome
        System.out.println("------------------------");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }

}
