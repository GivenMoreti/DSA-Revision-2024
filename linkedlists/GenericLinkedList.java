/*
 * THIS GENERIC LINKEDLIST CONTAINS ALL THE METHODS YOU CAN POTENTIALLY THINK OF.
 */

package linkedlists;

public class GenericLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    // OUTER CONSTRUCTOR
    public GenericLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*
     * METHODS FOR THE OUTER CLASS
     */

    /* MERGING USING THIS LINKEDLIST */

    public GenericLinkedList<T> mergeThis(GenericLinkedList<T> paramList) {
        Node<T> ptrThis = head;
        Node<T> ptrParam = paramList.head;
        GenericLinkedList<T> returnList = new GenericLinkedList<T>();

        while (ptrThis != null && ptrParam != null) {
            if (((Comparable) ptrThis.element).compareTo(ptrParam.element) <= 0) {
                returnList.append(ptrThis.element);
                ptrThis = ptrThis.next;
            } else {
                returnList.append(ptrParam.element);
                ptrParam = ptrParam.next;
            }
        }
        return returnList;
    }

    /* GET LENGTH OF THE LL */
    public int getLength() {
        int count = 0;

        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    /* INSERT AT A GIVEN INDEX */
    public void insertAtIndex(int index, T value) throws Exception {

        Node<T> node = new Node<T>(value);

        if (index < 0) {
            throw new Exception("Index out of range");

        }

        if (index == 1) {
            // you are inserting at first position.

            node.next = head;
            head = node;
            return;
        }

        // we need a previous pointer
        Node<T> previous = head;
        int count = 1;

        // Check if the list is empty and index is greater than 1
        if (previous == null) {
            throw new IndexOutOfBoundsException("Cannot insert at index " + index + " in an empty list.");
        }

        while (count < index - 1) {

            previous = previous.next;
            count++;

            // Check if the list is empty and index is greater than 1
            if (previous == null) {
                throw new IndexOutOfBoundsException("Cannot insert at index " + index + " in an empty list.");
            }

        }

        Node<T> current = previous.next;
        node.next = current;
        previous.next = node;

    }

    /* INSERT AT THE END OF THE LINKEDLIST */
    public void append(T element) {

        Node<T> node = new Node<T>(element); // node is the address

        // if the linkedlist is empty
        if (head == null) {

            head = tail = node;
        } else {
            // insert at the end
            tail.next = node;
            tail = node; // tail is now on the last node

        }
    }

    /*
     * TOSTRING METHOD FOR THE OUTER CLASS.
     */
    public String toString() {
        Node<T> ptr = head;
        String result = "[";

        while (ptr != null) {
            result += ptr.element;

            // add commas
            if (ptr.next != null) {
                result += ", ";
            }
            ptr = ptr.next;
        }
        result += "]";

        return result;
    }

    /* INSERT AT THE BEGINNING OF THE LL */
    public void prepend(T element) {
        Node<T> node = new Node<T>(element);
        node.next = head;
        head = node;

        // EMPTY LIST
        if (tail == null) {
            tail = head;
        }
    }

    /* RETURNS A LIST WITHOUT DUPLICATES */
    public GenericLinkedList<T> getUnique() {
        GenericLinkedList<T> myUniques = new GenericLinkedList<T>();
        Node<T> cNode = head;

        while (cNode != null) {
            boolean isUnique = true;
            Node<T> temp = head;
            // Check if cNode.element is already in myUniques
            while (temp != cNode) {
                if (((Comparable) temp.element).compareTo(cNode.element) == 0) {
                    isUnique = false;
                    break;
                }
                temp = temp.next; // Advance pointer
            }

            // If unique, add to myUniques
            if (isUnique) {
                myUniques.append(cNode.element);
            }

            cNode = cNode.next; // Advance pointer
        }

        return myUniques;
    }

    // get min and max

    public T getMin() {
        Node<T> min = head;
        Node<T> temp = head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(min.element) < 1) {
                min = temp;
            }
            temp = temp.next;
        }
        return (T) min.element;
    }

    public T getMax() {
        Node<T> max = head;
        Node<T> temp = head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(max.element) >= 1) {
                max = temp;
            }
            temp = temp.next;
        }
        return (T) max.element;
    }

    //
    public boolean isPalindrome(GenericLinkedList<T> list) {
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

    /* RETURNS AN ARRAY WITH ELEMENTS BIGGER THAN THE INDEX SPECIFIED */
    public GenericLinkedList<T> getFiltered(T item) {
        GenericLinkedList<T> someList = new GenericLinkedList<T>();
        Node<T> temp = head;

        while (temp != null) {
            if (((Comparable) temp.element).compareTo(item) > 0) {

                someList.append(temp.element); // append

            }

            temp = temp.next;
        }

        return someList;
    }

    /** Return the head element in the list */
    public T getFirst() {
        if (head == null) {
            return null;
        } else {
            return head.element;
        }
    }

    /** Return the last element in the list */
    public T getLast() {
        if (head == null) { // LIST IS EMPTY
            return null;
        } else {
            return tail.element;
        }
    }

    public boolean delete(T item) {
        Node<T> ptr = head;
        Node<T> prvPtr = null;
        while (ptr != null && ((Comparable) ptr.element).compareTo(item) != 0) {
            prvPtr = ptr;
            ptr = ptr.next;
        }
        if (ptr == null) // item not found
            return false;
        if (ptr == head) // item is first element
            head = head.next;

        else // general case
             // prvPtr.next = ptr.next; //lecturer's
            prvPtr.next = prvPtr.next.next; // Given's
        if (ptr == tail) // last element
            tail = prvPtr; // reassign tail
        return true;
    }

    public void clear() {
        head = tail = null;
    }

    // how many elements are in the list
    public int getSize() {
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    /* SWAP TWO NODES */
    public void swap(Node<T> node1, Node<T> node2) {
        Node<T> temp = node1;
        node1 = node2;
        node2 = temp;
    }

    public void swap(T item, T item2) {
        T temp = item;
        item = item2;
        item2 = temp;
    }

    /* REVERSE A SINGLY LINKED LIST */
    public void reverse() {
        // swap head and tail
        Node<T> current = head;
        Node<T> next = null;
        Node<T> prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }

    public boolean contains(T item) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.element == item) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /* MERGING OF TWO LINKEDLISTS */
    public GenericLinkedList<T> merge(GenericLinkedList<T> genList1, GenericLinkedList<T> genList2) {
        GenericLinkedList<T> main = new GenericLinkedList<T>();
        Node<T> hFirst = genList1.head;
        Node<T> hSecond = genList2.head;

        while (hFirst != null && hSecond != null) {
            if (((Comparable) hFirst.element).compareTo(hSecond.element) < 0) {
                main.append(hFirst.element);
                hFirst = hFirst.next;
            } else {
                main.append(hSecond.element);
                hSecond = hSecond.next;
            }
        }

        while (hFirst != null) {
            main.append(hFirst.element);
            hFirst = hFirst.next;
        }

        while (hSecond != null) {
            main.append(hSecond.element);
            hSecond = hSecond.next;
        }

        return main;
    }

    public void insertAtSomeIndex(int index, T item) {

        if (index < 0) {
            System.out.println("index out of bounds");
            return;
        }

        if (index == 1) {
            append(item);
            return;
        }

        // create node
        Node<T> node = new Node<T>(item);
        Node<T> prev = head;

        int count = 1;
        while (count < index - 1) {
            prev = prev.next;
            count++;
        }
        Node<T> current = prev.next;
        node.next = current;
        prev.next = node;
    }

    // public T midElement(){
    
    // T mid;
    // return mid;
    // }
    // INNER CLASS

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
