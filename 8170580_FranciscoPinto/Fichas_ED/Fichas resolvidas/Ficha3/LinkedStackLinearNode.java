package Ficha3;

/**
 * <h3>
 * <strong>Class that represents the structure of a {@link LinkedStackLinearNode Linked Stack} that implements the
 * contract of a {@link StackADT StackADT}</strong>
 * </h3>
 *
 * @param <T> Abstract Data Type
 * @author Luis Marques
 */
public class LinkedStackLinearNode<T> implements StackADT<T> {

    /**
     * int that represents the number of elements of the {@link LinkedStackLinearNode Linked Stack}
     */
    private int count = 0;

    /**
     * {@link LinearNode Linear Node} that represents the top node of the {@link LinkedStackLinearNode Linked Stack}
     */
    private LinearNode<T> top;

    /**
     * Creates an empty {@link LinkedStackLinearNode Linked Stack}.
     */
    public LinkedStackLinearNode() {
        top = null;
    }
    
    /**
     * Adds one element to the top of this stack.
     *
     * @param element T element to be pushed onto stack
     */
    @Override
    public void push(T element) {
        LinearNode<T> tempNode = new LinearNode<T>(element);
        tempNode.setNext(top);
        top = tempNode;
        count++;
    }

    /**
     * Removes and returns the top element from this stack.
     *
     * @return T element removed from the top of the stack
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if (top == null)
            throw new EmptyCollectionException("Stack");

        T removed = top.getElement();
        top = top.getNext();
        count--;

        return removed;
    }

    /**
     * Returns without removing the top element of this stack.
     *
     * @return T element on top of the stack
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("Stack");
        T result = (T) top.getElement();

        return result;
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
        return count;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return String representation of this stack
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("-> Linked Stack: <-");
        if (top != null) {
            string.append("\n").append(top.getElement());
            while (top.getNext() != null) {
                top = top.getNext();
                string.append("\n").append(top.getElement());
            }
        }

        return string.toString();
    }
}