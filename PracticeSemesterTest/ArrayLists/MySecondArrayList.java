package PracticeSemesterTest.ArrayLists;

import java.util.Arrays;

public class MySecondArrayList<T> {
    private T[] data;
    private int DEFAULT_SIZE = 10;
    int size;

    // constructor
    public MySecondArrayList() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    /* METHODS */

    // INSERTION

    // insert at the beginning
    public void prepend(T item) {

        if (isFull()) {
            resize();
        }
        // shift items to right if list is not empty
        for (int i = size - 1; i > 0; i--) {
            data[i + 1] = data[i]; // assign in next element space the current element
        }
        data[0] = item;
        size++;
    }

    // insert at index
    public void insertAtIndex(int index, T item) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Size: " + size + " and index " + index);
        }

        if (isFull()) {
            resize();
        }
        // shift elements to the right
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = item;
        size++;
    }

    // insert at the end

    public T append(T item) {
        if (isFull()) {
            resize();
        }
        return data[size++] = item; // insert at the end
    }

    public void resize() {

        T[] temp = (T[]) new Object[data.length * 2];
        // remember temp is a scoped array you have to reassign to original data[]
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    // DELETION

    // DELETE AT THE BEGINNING
    public void deleteStart() {

        if (size == 0) {
            throw new IllegalStateException("Empty list");
        }
        // shift elements to left
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];

        }
        size--;
        data[size] = null;
    }

    // DELETE AT THE END
    public T deleteEnd() {
        // empty list
        if (size == 0) {
            throw new IllegalStateException("Empty list");
        }

        T deletedItem = data[size - 1];

        data[size - 1] = null;

        size--;
        return deletedItem;
    }
    // DELETE AT INDEX

    public T deleteIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        if (index == 0) {
            deleteStart();
        }

        if (index == size - 1) {
            deleteEnd();
        }
        T deleted = data[index];
        // if index is in the middle shifting left is required
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;

        return deleted;
    }

    // toString
    public String toString() {
        return "Data: " + Arrays.toString(data);
    }

    // get size
    public int getSize() {
        return size;
    }

    // public int getCapacity
    public int getCapacity() {
        return data.length;
    }

    // contains
    public boolean contains(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                return true;
            }
        }
        return false;
    }

    // clear
    public void clear() {
        size = 0;
    }

    // swap

    public void swap(T first, T second) {

        T temp = first;
        first = second;
        second = temp;
    }

    // sorting

    public boolean sort() {

        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {

                if (((Comparable<T>) data[j]).compareTo(data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        return true;
    }

}
