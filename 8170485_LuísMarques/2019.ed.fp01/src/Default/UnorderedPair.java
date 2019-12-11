package Default;

/**
 * <h3>
 * <strong>Classe UnorderedPair (slide 37 - Aula 01)</strong>
 * </h3>
 *
 * @param <T> Tipo Parametrizado
 * @author Luís Marques
 */
public class UnorderedPair<T extends Comparable> extends Pair<T> {

    /**
     * Construtor para a criação de uma instância de um {@link UnorderedPair Par Desordenado de um Tipo Parametrizado}
     */
    public UnorderedPair() {
        super.setFirst(null);
        super.setSecond(null);
    }

    /**
     * Construtor para a criação de uma instância de um {@link UnorderedPair Par Desordenado de um Tipo Parametrizado}
     * definido
     *
     * @param firstItem primeiro elemento
     * @param secondItem segundo elemento
     */
    public UnorderedPair(T firstItem, T secondItem) {
        super.setFirst(firstItem);
        super.setSecond(secondItem);
    }

    /**
     * Método para obter o primeiro elemento de um {@link UnorderedPair Par Desordenado de um Tipo Parametrizado}
     * @return primeiro elemento
     */
    public T getFirstItem() {
        return super.getFirst();
    }

    /**
     * Método para obter o segundo elemento de um {@link UnorderedPair Par Desordenado de um Tipo Parametrizado}
     * @return segundo elemento
     */
    public T getSecondItem() {
        return super.getSecond();
    }


    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            UnorderedPair<T> otherPair
                    = (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst())
                    && getSecond().equals(otherPair.getSecond()))
                    || (getFirst().equals(otherPair.getSecond())
                    && getSecond().equals(otherPair.getFirst()));
        }
    }

}
