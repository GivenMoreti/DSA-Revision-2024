package PracticeSemesterTest.Queues;

import PracticeSemesterTest.ArrayLists.MyThirdArrayList;

public class MyThirdQueue<T> {
    MyThirdArrayList<T> queue;

    // constructor
    public MyThirdQueue() {
        queue = new MyThirdArrayList<T>();
    }

    // custom methods

    // enqueue -- add a the end
    public void enqueue(T element) {
        queue.append(element);
    }

    // dequeue -- remove at the beginning
    public T dequeue() {
        T temp = null;
        if (queue.getSize() > 0) {

            temp = queue.remove(0);
        }
        return temp;
    }

}
