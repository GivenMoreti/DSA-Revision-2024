package Examples;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        String name = "Given";

        for (char ch : name.toCharArray()) {

            if (ch == 'i') {
                continue;
            }

            if (ch == 'e') {
                break;
            }

            list.add(ch);

        }
        System.out.println(list);

        /*
         * [G, i, v, e, n]
         * [G, v]
         */

        // multidimensional arraylist
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        // initialize

        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2); // [[2, 3, 4], [5, 6, 7], [3, 4, 5]]
        in.close();
    }
}
