package List;

/**
 * <h3>
 * <strong></strong>
 * </h3>
 *
 * @param <T>
 */
public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {

    /**
     * Creates an empty list using the default capacity
     */
    public ArrayUnorderedList() {
        super();
    }

    /**
     * Creates an empty list using the initial capacity defined by the user
     *
     * @param initialCapacity int initial capacity
     */
    public ArrayUnorderedList(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Adds the specific element to the front of this list.
     *
     * @param element the element to be added to this list
     */
    @Override
    public void addToFront(T element) {

    }

    /**
     * Adds the specific element to the rear of this list.
     *
     * @param element the element to be added to this list
     */
    @Override
    public void addToRear(T element) {

    }

    /**
     * Adds the specific element after a particular element already in this list.
     *
     * @param element the element to be added to this list
     * @param target  the element to be referenced to add the specific element
     */
    @Override
    public void addAfter(T element, T target) {

    }
}
