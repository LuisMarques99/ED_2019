package List;

import Exceptions.ElementNotComparableException;

/**
 * <h3>
 * <strong></strong>
 * </h3>
 *
 * @param <T>
 */
public interface OrderedListADT<T> extends ListADT<T> {
    /**
     * Adds the specific element to this list at the proper location.
     *
     * @param element the element to be added to this list
     */
    public void add(T element) throws ElementNotComparableException;
}
