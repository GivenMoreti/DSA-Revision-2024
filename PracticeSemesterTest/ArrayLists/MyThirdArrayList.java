package PracticeSemesterTest.ArrayLists;

import java.util.Arrays;

public class MyThirdArrayList<T> {
    private T[] data;
    private static final int DEFAULT_SIZE = 10;
    int size;

    public MyThirdArrayList() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    // create methods.

    // insertion @ start,end,index
    public void prepend(T element) {

        if (isFull()) {
            resize();
        }

        // shift elements to right
        for (int i = size - 1; i > 0; i--) {
            data[i + 1] = data[i];
        }

        data[0] = element;
        size++;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        T[] temp = (T[]) new Object[data.length * 2];

        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void append(T element) {

        if (isFull()) {
            resize();
        }

        data[size] = element;
        size++;
    }

    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + " Size: " + size);
        }

        if (isFull()) {
            resize();
        }
        if (index == 0) {
            prepend(element);
        }

        // move elements from index to right

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = element;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    // deletion @start,end,index,

    public T deleteStart() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        // shift elements
        for (int i = 0; i < size; i++) {
            data[i] = data[i + 1];
        }
        T deletedItem = data[0];

        size--;
        return deletedItem;
    }

    public T deleteEnd() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        T deletedItem = data[size - 1];
        data[size - 1] = null;
        size--;
        return deletedItem;
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

    // isPalindrome

    public boolean isPalindrome(MyThirdArrayList<T> list) {
        int last = list.getSize() - 1;
        int first = 0;
        if (list.getSize() == 0) {
            return false;
        }

        if (list.getSize() == 1) {
            return true;
        }
        while (first < last) {
            if (last != first) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    // delete element at specified index
    public T delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        if (isEmpty()) {
            throw new IllegalStateException("list is empty");
        }

        if (index == 0) {
            deleteStart();
        }
        if (index == size - 1) {
            deleteEnd();
        }

        // move elements to the left
        for (int i = 0; i < size; i++) {
            data[i] = data[i + 1];
        }
        T deletedElement = data[index];
        size--;
        return deletedElement;
    }

    public void sort() {
        boolean isSorted;
        for (int i = 0; i < data.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < data.length - i - 1; j++) {
                // swap

                if (((Comparable) data[j]).compareTo(data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    isSorted = false;
                }

            }
            if (isSorted) {
                System.out.println("arr sorted already");
                break;
            }
        }

    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += data[i];
            if (i < size - 1) {
                res += ",";
            }
        }
        res += "]";
        return res;
    }

    // public String toString() {
    // return "Data: " + Arrays.toString(data);
    // }
}
