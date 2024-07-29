package GenericsPart1;

import java.util.Arrays;

public class MyArrayList {
    // INITIALIZE REQUIRED VARIABLES
    private int size;
    private static int DEFAULT_SIZE = 10;
    private int[] data;

    // CONSTRUCTOR
    public MyArrayList() {
        data = new int[DEFAULT_SIZE];
        size = 0;
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        // add at the end of the size
        data[size++] = num;
    }

    private void resize() {
        // CREATE A TEMPORARY ARRAY WITH DOUBLE THE SIZE OF THE DATA ARRAY
        int[] temp = new int[data.length + 1];
        // int[] temp = new int[data.length *2];

        // COPY ALL THE ELEMENTS OF DATA INTO THE TEMP ARRAY
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    // DECREASES THE SIZE OF THE ARR BY 1
    public int remove() {
        return data[--size];
    }

    @Override
    public String toString() {
        return "Size: " + this.size + "\nData: " + Arrays.toString(data) + "\nCapacity: " + data.length;
    }

    public void set(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("out of bound, Size: " + size + " & Capacity: " + data.length);
        }
        data[index] = element;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    /*
     * REMEMBER CAPACITY IS data.length
     * size = number of elements in the array.
     * while size is less than capacity the array can take in new elements
     * else resize arr
     */

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);

        System.out.println(list);
    }
}
