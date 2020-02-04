package Queue;

/**
 * <h3>
 * <strong>Exception that represents an Empty Collection</strong>
 * </h3>
 *
 * @author Luis Marques
 */
public final class EmptyCollectionException extends Exception {
    public EmptyCollectionException(String message) {
        super(message);
    }
}