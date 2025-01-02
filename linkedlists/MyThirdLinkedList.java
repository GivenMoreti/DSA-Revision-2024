package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class MyThirdLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public MyThirdLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // is palindrome

    // getunique
    public MyThirdLinkedList<T> getUnique(MyThirdLinkedList<T> list) {
        Node<T> temp = list.head;
        MyThirdLinkedList<T> rList = new MyThirdLinkedList<>();

        while (temp != null) {
            if (temp.next == null || ((Comparable<T>) temp.element).compareTo(temp.next.element) != 0) {
                rList.append(temp.element);
            }
            temp = temp.next;
        }
        return rList;
    }

    public MyThirdLinkedList<T> getUnique() {
        MyThirdLinkedList<T> rList = new MyThirdLinkedList<>();
        Node<T> temp = head;
        while (temp != null) {

            boolean present = false;
            Node<T> temp2 = rList.head;

            while (temp2 != null) {
                if (((Comparable) temp.element).compareTo(temp2.element) == 0) {
                    present = true;
                    break;
                }
                temp2 = temp2.next;
            }
            if (!present) {
                rList.append(temp.element);

            }
            temp = temp.next;
        }
        return rList;
    }

    // merge
    public MyThirdLinkedList<T> merge(MyThirdLinkedList<T> list1, MyThirdLinkedList<T> list2) {
        MyThirdLinkedList<T> rList = new MyThirdLinkedList<T>();
        // start with first list1
        Node<T> temp1 = list1.head;
        Node<T> temp2 = list2.head;

        while (temp1 != null && temp2 != null) {
            if (((Comparable) temp1.element).compareTo(temp2.element) < 0) {
                rList.append(temp1.element);
                temp1 = temp1.next;
            } else {
                rList.append(temp2.element);
                temp2 = temp2.next;
            }
        }

        // for the remaining elements
        while (temp1 != null) {
            rList.append(temp1.element);
            temp1 = temp1.next;
        }

        // remaining items in 2
        while (temp2 != null) {
            rList.append(temp2.element);
            temp2 = temp2.next;
        }

        return rList;

    }

    // ispalindrome

    public boolean isPalindrome(MyThirdLinkedList<T> list) {
        Node<T> temp = list.head;
        Node<T> temp2 = list.tail;

        if (list.head == null) {
            return false;
        }

        if (list.head == list.tail) {
            return true;
        }

        int count = 1;
        Node<T> prev = head;
        Node<T> prev2 = head;
        while (count < list.getSize() - 1) {
            count++;
            prev = prev.next; // advance pointer

        }

        return false;
    }

    // sort

    // return in between indexes
    public MyThirdLinkedList<T> betweenElements(MyThirdLinkedList<T> paramList, T element, T element2) {
        MyThirdLinkedList<T> list = new MyThirdLinkedList<>();
        Node<T> temp = paramList.head;

        while (temp != null) {
            // element <= x <= element2
            if ((((Comparable) temp.element).compareTo(element) > 0)
                    && (((Comparable) temp.element).compareTo(element2) < 0)) {
                list.append(temp.element);
            }
            temp = temp.next;
        }

        return list;
    }

    // [4,1,33,56,79];
    // larger than 33 [56,79]

    public MyThirdLinkedList<T> returnLarger(MyThirdLinkedList<T> paramlist, T element) {
        MyThirdLinkedList<T> list = new MyThirdLinkedList<>();
        Node<T> temp = paramlist.head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(element) > 0) {
                list.append(temp.element);
            }
            temp = temp.next;
        }

        return list;
    }

    /* Smaller than */

    public MyThirdLinkedList<T> returnSmaller(MyThirdLinkedList<T> paramlist, T element) {
        MyThirdLinkedList<T> list = new MyThirdLinkedList<>();
        Node<T> temp = paramlist.head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(element) < 0) {
                list.append(temp.element);
            }
            temp = temp.next;
        }

        return list;
    }
    // insert at start,end,index

    public void append(T element) {
        Node<T> node = new Node<T>(element);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node; // tail is now on the last node
        }
    }

    public void prepend(T element) {
        Node<T> node = new Node<T>(element);
        if (head == null) {
            append(element);
        }

        head = node;

    }

    public void insert(int index, T element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index: " + index);
        }

        if (index == 1) {
            prepend(element);
        }

        Node<T> node = new Node<T>(element);
        Node<T> prev = head;
        int count = 1;
        while (count < index - 1) {
            prev = prev.next; // advance pointer
            count++;
        }
        Node<T> current = prev.next;
        node.next = current;
        prev.next = node;

    }

    @Override
    public String toString() {
        Node<T> temp = head;
        String res = "[";

        while (temp != null) {

            res += temp.element;

            if (temp.next != null) {
                res += ",";
            }
            temp = temp.next;
        }
        res += "]";
        return res;
    }

    public int getSize() {
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next; // advance pointer
        }
        return count;
    }

    public T getLast() {
        return tail.element;
    }

    public T getFirst() {
        return head.element;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean contains(T element) {
        Node<T> temp = head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(element) == 0) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // delete @ start, end,index

    public void deleteStart() {
        // if list is empty
        if (head == null) {
            return;
        }
        head = head.next;

    }

    // public MyThirdLinkedList sharedElements(MyThirdLinkedList otherList) {
    //     Set<Integer> sharedSet = new HashSet<>();
    //     Set<Integer> uniqueSet = new HashSet<>();

    //     // Traverse the parameter list and add elements to uniqueSet
    //     Node temp = otherList.head;
    //     while (temp != null) {
    //         uniqueSet.append(temp.element);
    //         temp = temp.next;
    //     }

    //     // Traverse the calling list and add common elements to sharedSet
    //     temp = this.head;
    //     while (temp != null) {
    //         if (uniqueSet.contains(temp.element)) {
    //             sharedSet.add(temp.element); // HashSet ensures no duplicates
    //         }
    //         temp = temp.next;
    //     }

    //     // Create a new linked list with shared elements
    //     MyLinkedList result = new MyLinkedList();
    //     for (int value : sharedSet) {
    //         result.add(value);
    //     }

    //     return result;
    // }

    private class Node<T> {
        T element;
        Node<T> next;

        // inner class constructor
        public Node(T element) {
            this.element = element;
            this.next = null;
        }

    }

}
