package StacksExample;

public class CustomStack {
    private int[] data;
    public static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack(int size) {
        data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    // CUSTOM METHODS
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    // public void display() {
    // while (ptr != null) {

    // }
    // }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    // remove item of integer type.
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
