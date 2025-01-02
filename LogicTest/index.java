package LogicTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<Integer> nums = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        part1(nums, set, 2);

    }

    public static void part1(ArrayList<Integer> nums, HashSet<Integer> mySet, int limit) {
        try {
            Scanner scan = new Scanner(System.in);
            int count = 0;

            while (count <= limit) {

                System.out.println("Enter a number: ");
                int number = scan.nextInt();
                
                if (number > 0 && number < 50) {
                    nums.add(number);
                    mySet.add(number);
                    count++;
                }
            }

            System.out.println("Numbers you have entered: ");
            System.out.println(nums);

            System.out.println("Set numbers: ");
            System.out.println(mySet);

            scan.close();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
