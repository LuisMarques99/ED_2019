package LinkedStack;

import Default.EmptyCollectionException;
import Default.StackADT;

public class LinkedStack<T> implements StackADT<T> {

    public LinkedStack() {
    }

    @Override
    public void push(T element) {
    }

    @Override
    public T pop() throws EmptyCollectionException {
        return null;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("Stack");

        return null;
    }

    /**
     * Returns true if this stack contains no elements.
     *
     * @return boolean whether or not this stack is empty
     */
    @Override
    public boolean isEmpty() {
        if (size() == 0)
            return true;

        return false;
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return int number of elements in this stack
     */
    @Override
    public int size() {
        return 0;
    }
}