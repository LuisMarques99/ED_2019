package List;

import Exceptions.EmptyCollectionException;
import Exceptions.ElementNotFoundException;

import java.util.Iterator;

public abstract class ArrayList<T> implements ListADT<T> {
    int DEFAULT_CAPACITY = 100;
    int count;
    int front;
    int rear;
    T[] list;

    public ArrayList() {
        count = 0;
        front = 0;
        rear = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayList(int initialCapacity) {
        count = 0;
        front = 0;
        rear = 0;
        list = (T[]) (new Object[initialCapacity]);
    }

    /**
     * Removes the first element from this list.
     *
     * @return the first element of this list
     */
    @Override
    public T removeFirst() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("List");
        }

        T removed = list[front];
        for (int i = 0; i < size(); i++) {
            list[i] = list[i + 1];
        }
        count--;

        return removed;
    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element of this list
     */
    @Override
    public T removeLast() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("List");
        }

        T removed = list[rear - 1];
        list[rear - 1] = null;
        rear = rear - 1;
        count--;

        return removed;
    }

    /**
     * Removes and returns the specific element of this list.
     *
     * @param element the element to be removed from this list
     * @return the element removed from this list
     */
    @Override
    public T remove(T element) throws EmptyCollectionException, ElementNotFoundException {
        if (isEmpty()) {
            throw new EmptyCollectionException("List");
        }

        boolean found = false;
        int current = front;

        if (element.equals(list[front])) {
            removeFirst();
        } else if (element.equals(list[rear - 1])) {
            removeLast();
        }
        while (list[current] != null && !found) {
            if (element.equals(list[current])) {
                found = true;
            }
            current++;
        }
        if (!found) {
            throw new ElementNotFoundException("List");
        }
        for (int i = current; i < size(); i++) {
            list[i] = list[i + 1];
        }
        count--;

        return list[current];
    }

    /**
     * Returns a reference to the first element of this list.
     *
     * @return a reference to the first element of this list
     */
    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("List");
        }

        return list[front];
    }

    /**
     * Returns a reference of the last element of this list.
     *
     * @return a reference to the first element of this list
     */
    @Override
    public T last() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("List");
        }

        return list[rear - 1];
    }

    /**
     * Returns true if this list contains the specific target element.
     *
     * @param target the target that is being sought in the list
     * @return true if this list contains this element
     */
    @Override
    public boolean contains(T target) {
        for (T element : list) {
            if (target.equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }

        return false;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the integer representation of number of elements in this list
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Returns an iterator for the elements in this list.
     *
     * @return an iterator over the elements in this list
     */
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }
}
