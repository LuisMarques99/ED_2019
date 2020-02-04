package Default;

/**
 * <h3>
 * <strong>Classe genérica TwoTypePair (slides 26 e 27 - Aula 01)</strong>
 * </h3>
 *
 * @author Luís Marques
 * @param <T1> Tipo Parametrizado 1
 * @param <T2> Tipo Parametrizado 2
 */
public class TwoTypePair<T1, T2> {

    private T1 first;
    private T2 second;

    /**
     * Construtor para a criação de uma instância de um {@link TwoTypePair Par de Dois Tipos Parametrizados}
     */
    public TwoTypePair() {
        first = null;
        second = null;
    }

    /**
     * Construtor para a criação de uma instância de um {@link TwoTypePair Par de Dois Tipos Parametrizados} definidos
     * @param first elemento de um tipo parametrizado
     * @param second elemento de outro tipo parametrizado
     */
    public TwoTypePair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Método para obter o primeiro tipo parametrizado
     * @return elemento de um tipo parametrizado
     */
    public T1 getFirst() {
        return first;
    }

    /**
     * Método para definir o primeiro tipo parametrizado
     * @param first elemento de um tipo parametrizado
     */
    public void setFirst(T1 first) {
        this.first = first;
    }

    /**
     * Método para obter o segundo tipo parametrizado
     * @return elemento de um tipo parametrizado
     */
    public T2 getSecond() {
        return second;
    }

    /**
     * Método para definir o segundo tipo parametrizado
     * @param second elemento de um tipo parametrizado
     */
    public void setSecond(T2 second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return ("first: " + first.toString() + "\nsecond: " + second.toString());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (this.getClass() != otherObject.getClass()) {
            return false;
        } else {
            TwoTypePair otherPair = (TwoTypePair) otherObject;
            return (first.equals(otherPair.first)
                    && second.equals(otherPair.second));
        }
    }
}
