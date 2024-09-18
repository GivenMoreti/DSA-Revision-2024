package PracticeSemesterTest.Stacks;

import java.util.Arrays;

import PracticeSemesterTest.ArrayLists.MyThirdArrayList;

public class MyThirdStack<T> {
    MyThirdArrayList<T> stack;

    // constructor
    public MyThirdStack() {
        stack = new MyThirdArrayList<T>();
    }

    // push/pop

    public void push(T element) {
        stack.append(element);
    }

    // remove from the top which is similar to deleteEnd()
    public T pop() {
        T temp = null;
        if (stack.getSize() > 0) {

            temp = stack.delete(stack.getSize() - 1);
        }
        return temp;
    }

    public String toString() {
        return "Stack: " + stack;
    }

}
