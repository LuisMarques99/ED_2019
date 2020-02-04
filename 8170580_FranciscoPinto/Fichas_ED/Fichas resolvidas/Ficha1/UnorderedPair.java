package Ficha1; //Parte 1

public class UnorderedPair<T extends Comparable> extends Pair<T>{
	
	public UnorderedPair() {
		super.setFirst(null);
		super.setSecond(null);
	}
	
    public UnorderedPair(T firstItem, T secondItem) {
        super.setFirst(firstItem);
        super.setSecond(secondItem);
    }
    
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            //Se os pares desordenados forem iguais mesmo que nao sejam da mesmo posicao, irá retornar true!
            UnorderedPair<T> otherPair
                    = (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst())
                    && getSecond().equals(otherPair.getSecond()))
                    || (getFirst().equals(otherPair.getSecond())
                    && getSecond().equals(otherPair.getFirst()));
        }
    }
}
