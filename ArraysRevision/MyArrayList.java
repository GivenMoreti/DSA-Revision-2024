package ArraysRevision;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size;
    private T[] data;
    private final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    // add at the end of the arraylist
    public void append(T item) {

        if (isFull()) {
            resize();
        }
        data[size++] = item;
    }

    // isfull
    private boolean isFull() {
        return size == data.length;
    }

    // resize
    public void resize() {
        T[] temp = (T[]) new Object[size * 2];

        // copy all the elements into temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // get size
    public int getSize() {
        return data.length - 1;
    }

    // to String

    public String toString() {
        return "Data: " + Arrays.toString(data) + "\nSize: " + size;
    }

    // remove at the end.
    public T remove() {
        // T removedItem = data[size];
        // size--;
        if (isEmpty()) {
            System.out.println("You can't remove from an empty arraylist");
        }

        return data[size--];
    }

    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
        }

        T removedElement = data[index];

        // shift the elements back
        // eg removed the first index
        for (int i = 0; i < getSize(); i++) {
            data[i] = data[i + 1];
        }
        size--;
        return removedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}