package PracticeExam.Stacks;

import PracticeExam.Linkedlists.MyLinkedList;

public class MyStackLL<T> {
    MyLinkedList<T> stack;

    // constructor
    public MyStackLL() {
        stack = new MyLinkedList<>();
    }

    // custom methods

    public boolean pop() {
        return false;
    }

    public void push(T element) {
        if (element != null) {
            stack.append(element);
        }
    }
}
