package PracticeSemesterTest.Stacks;

import PracticeSemesterTest.ArrayLists.MySecondArrayList;

public class Main {

    public static void main(String[] args) {
        MyThirdStack<Integer> stack = new MyThirdStack<Integer>();
        stack.push(34);
        stack.push(300);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
