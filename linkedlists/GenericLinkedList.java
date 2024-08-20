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
    public void append(T element) {

        Node<T> node = new Node<>(element); // node is the address

        // if the linkedlist is empty
        if (head == null) {
            // append(element);
            // return;
            head = tail = node;
        } else {

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

    public void prepend(T element) {
        Node<T> node = new Node<>(element);
        node.next = head;
        head = node;

        // EMPTY LIST
        if (tail == null) {
            tail = head;
        }
    }

    /* RETURNS A LIST WITHOUT DUPLICATES */
    public GenericLinkedList<T> getUnique() {
        GenericLinkedList<T> myUniques = new GenericLinkedList<>();
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

    public boolean isPalindrome() {
        Node<T> temp = head;
        while (temp.next != null) {
            // immediately theres a repeating elements in succession returns true
            if (((Comparable) temp.element).compareTo(temp.next.element) == 0) {
                return true;
            }
            temp = temp.next;
        }
        if (head == null) {
            temp = null;
        }

        temp = tail;
        temp.next = null;
        return false;
    }

    /* RETURNS AN ARRAY WITH ELEMENTS BIGGER THAN THE INDEX SPECIFIED */
    public GenericLinkedList<T> getFiltered(T item) {
        GenericLinkedList<T> someList = new GenericLinkedList<>();
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
