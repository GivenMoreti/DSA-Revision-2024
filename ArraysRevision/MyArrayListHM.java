package ArraysRevision;


public class MyArrayListHM<E> {
    private int size; // Number of elements in the list
    private E[] data;
    private int MAXELEMENTS = 100;
  
    /** Create an empty list */
    public MyArrayListHM() {
      data = (E[]) new Object[MAXELEMENTS];// cannot create array of generics
      size = 0; // Number of elements in the list
    }
  
    public boolean isFull() {
      if (size < MAXELEMENTS)
        return false;
      else
        return true;
    }
  
    public void add(int index, E e) {
      // Ensure the index is in the right range
      if (index < 0 || index > size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
      // Move the elements to the right after the specified index
      for (int i = size - 1; i >= index; i--) {
        data[i + 1] = data[i];
      }
      // Insert new element to data[index]
      data[index] = e;
      // Increase size by 1
      size++;
    }
  
    public boolean contains(Object e) {
      for (int i = 0; i < size; i++)
        if (e.equals(data[i]))
          return true;
      return false;
    }
  
    public E get(int index) {
      if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
      return data[index];
    }
  
    public E remove(int index) {
      if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
      E e = data[index];
      // Shift data to the left
      for (int j = index; j < size - 1; j++)
        data[j] = data[j + 1];
      data[size - 1] = null; // This element is now null
      // Decrement size
      size--;
      return e;
    }
  
    public void clear() {
      size = 0;
    }
  
    public String toString() {
      String result = "[";
      for (int i = 0; i < size; i++) {
        result += data[i];
        if (i < size - 1)
          result += ", ";
      }
      return result.toString() + "]";
    }
  
    public int getSize() {
      return size;
    }
  
    public boolean sortList() {
      E hold;
      for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - 1; j++) {
          if (((Comparable) data[j]).compareTo(data[j + 1]) > 0) {
            hold = data[j + 1];
            data[j + 1] = data[j];
            data[j] = hold;
          }
        }
      }
      return true;
    }
   
  }
