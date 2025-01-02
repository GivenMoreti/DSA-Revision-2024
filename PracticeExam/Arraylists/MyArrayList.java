package PracticeExam.Arraylists;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size;
    private static final int DEFAULT_SIZE = 10;
    private T data[];

    public MyArrayList() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    // insert at the end

    public void append(T element) {
        if (isFull()) {
            resize();
        }
        data[size] = element;
        size++;
    }

    /* insert at the beginning */

    public void prepend(T element) {
        if (isFull()) {
            resize();
        }
        // shifting elements to right is required

        data[0] = element;
        size++;
    }

    /* insert at an index */
    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
        }
        if (index == 0) {
            prepend(element);
        }
        if (index == size) {
            append(element);
        }
        // shift to right
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = element;
        size++;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        T[] temp = (T[]) new Object[DEFAULT_SIZE * 2];
        // copy all the elements into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public String toString() {
        return Arrays.toString(data);
    }
}