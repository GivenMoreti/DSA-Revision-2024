package StacksExample;

import linkedlists.LL;

public class Main {
    public static void main(String[] args) throws Exception {

        LL<Integer> myStack = new LL<Integer>();
        myStack.push(99);
        myStack.push(9);
        myStack.push(111);
        myStack.push(33);

        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);

    



        /* stack test */
        // CustomStack stack = new CustomStack(4);
        // stack.push(23);
        // stack.push(43);
        // stack.push(54);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        /* CUSTOM STACK TEST */
        // GenericStack<Integer> stack2 = new GenericStack<>(3);
        // stack2.push(90);
        // stack2.push(9);
        // stack2.push(33);

        // System.out.println(stack2.pop());
        // System.out.println(stack2);
    }
}
