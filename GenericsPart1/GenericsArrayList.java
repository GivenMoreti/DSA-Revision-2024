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

    public void add(T element) {
        if (isFull()) {
            resize();
        }
        data[size++] = element;
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
        T removed = data[--size];
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
        size--;
        return removedElement;

    }

    public T get(int index) {
        return data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public static void main(String[] args) {
        GenericsArrayList<Integer> myList = new GenericsArrayList<>();
        // myList.add(3);

        for (int i = 0; i < 12; i++) {
            myList.add(2 + i);
        }

        GenericsArrayList<String> names = new GenericsArrayList<>();
        names.add("Givenchie");
        names.add("Tim");
        names.add("Jane");
        names.add("Doe");

        System.out.println(myList);
        System.out.println(names);
        names.remove(2);

    }
}
