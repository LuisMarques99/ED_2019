package List;

import Exceptions.ElementNotComparableException;

/**
 * <h3>
 * <strong></strong>
 * </h3>
 *
 * @param <T>
 */
public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T> {

    /**
     * Creates an empty list using the default capacity
     */
    public ArrayOrderedList() {
        super();
    }

    /**
     * Creates an empty list using the initial capacity defined by the user
     *
     * @param initialCapacity int initial capacity
     */
    public ArrayOrderedList(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Adds the specific element to this list at the proper location.
     *
     * @param element the element to be added to this list
     */
    @Override
    public void add(T element) throws ElementNotComparableException {

    }
}
