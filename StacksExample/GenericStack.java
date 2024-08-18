package StacksExample;

import java.util.Arrays;

public class GenericStack<T> {
    private T[] data;
    public static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    // DEFAULT CONTRUCTOR
    public GenericStack() {
        this(DEFAULT_SIZE);
    }

    public GenericStack(int size) {
        this.data = (T[]) (new Object[size]); /* type casting with (T[]) */
    }

    public boolean push(T item) throws Exception {

        if (isFull()) {
            throw new Exception("Stack is full");
        }

        ptr++;      
        data[ptr] = item;
        return true;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");

        }
        // T removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public String toString() {
        return "Data: " + Arrays.toString(data);
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

}
