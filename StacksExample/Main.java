package StacksExample;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(4);
        stack.push(23);
        stack.push(43);
        stack.push(54);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        /* CUSTOM STACK TEST */
        GenericStack<Integer> stack2 = new GenericStack<>(3);
        stack2.push(90);
        stack2.push(9);
        stack2.push(33);

        System.out.println(stack2.pop());
        System.out.println(stack2);
    }
}
