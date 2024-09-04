package GenericsPart1;

import java.util.Arrays;

public class GenericsArrayList<T> {
    private int size;
    public static int DEFAULT_SIZE = 10;
    private T[] data;

    public GenericsArrayList() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    // at at the end
    public void add(T element) {
        if (isFull()) {
            resize();
        }
        data[size++] = element;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("size = " + size + "& index: " + index);
        }
        // move elements to the right after adding.
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    private void resize() {
        T[] temp = (T[]) new Object[data.length * 2];
        // Object[] temp = new Object[data.length *2];
        // Object[] temp = new Object[data.length +2];

        // copy all elements from array into temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public String toString() {
        return "Data: " + Arrays.toString(data) + "\nSize: " + size + "\nCapacity: " + data.length;
    }

    // removing at the end
    public T remove() {
        // T removed = data[--size];
        T removed = data[size];
        size--;
        return removed;

    }

    // removing at an index.
    public T remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("size = " + size + "& index: " + index);
        }
        // each element at an index that is greater than index is decreased to have
        // index that is one less
        T removedElement = data[index];

        for (int i = index; i < size - 1; i++) {
            // each element at pos i is replaced with a following element
            data[i] = data[i + i];

        }
        data[size - 1] = null;
        size--;
        return removedElement;

    }

    public T get(int index) {
        return data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    // check if the list is empty

    public boolean isEmpty() {
        return size == 0;
    }
    // count elements in the list

    public int count() {
        return size;
    }

    public boolean sort() {
        T temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (((Comparable) data[j]).compareTo(data[j + 1]) > 0) {
                    temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return true;

    }

    public void filter(T low, T high) {
        GenericsArrayList<T> newArr = new GenericsArrayList<T>();
        for (int i = 0; i < newArr.size; i++) {
            if (((Comparable) newArr.get(i)).compareTo(low) >= 0) {

                newArr.add(low);
            }

            if (((Comparable) newArr.get(i)).compareTo(high) <= 0) {
                newArr.add(high);
            }
        }
        // System.out.println(newArr);
    }

    public static void main(String[] args) {
        GenericsArrayList<Integer> myList = new GenericsArrayList<>();
        myList.add(12);
        myList.add(3);
        myList.add(5);

        myList.sort();
        System.out.println(myList);
        myList.filter(5, 13);

    }
}
