package Default;

/**
 * <h3>
 * <strong>Classe Pair (slide 32 - Aula 01)</strong>
 * </h3>
 *
 * @author Luís Marques
 * @param <T> Tipo Parametrizado
 */
public class Pair<T extends Comparable> {

    private T first;
    private T second;

    /**
     * Construtor para a criação de uma instância de um {@link Pair Par de um Tipo Parametrizado}
     */
    public Pair() {
        first = null;
        second = null;
    }

    /**
     * Construtor para a criação de uma instância de um {@link Pair Par de um Tipo Parametrizado} definido
     * @param first primeiro elemento
     * @param second segundo elemento
     */
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Método para obter o primeiro elemento de um {@link Pair Par de um Tipo Parametrizado}
     * @return primeiro elemento
     */
    public T getFirst() {
        return first;
    }

    /**
     * Método para definir o primeiro elemento de um {@link Pair Par de um Tipo Parametrizado}
     * @param first primeiro elemento
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * Método para obter o segundo elemento de um {@link Pair Par de um Tipo Parametrizado}
     * @return segundo elemento
     */
    public T getSecond() {
        return second;
    }

    /**
     * Método para definir o segundo elemento de um {@link Pair Par de um Tipo Parametrizado}
     * @param second segundo elemento
     */
    public void setSecond(T second) {
        this.second = second;
    }

    /**
     * Método para obter o maior elemento de um {@link Pair Par de um Tipo Parametrizado}
     * @return
     */
    public T max() {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
