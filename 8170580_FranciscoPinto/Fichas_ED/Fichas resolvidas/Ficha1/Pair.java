<<<<<<< HEAD
package Ficha1; //Parte 1

@SuppressWarnings("rawtypes")
public class Pair <T extends Comparable> {
	private T first;
	private T second;
	
    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @SuppressWarnings("unchecked")
	public T max() {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
=======
package Ficha1; //Parte 1

public class Pair <T extends Comparable> {
	private T first;
	private T second;
	
    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T max() {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
>>>>>>> a65945f80e22f6b626673450dd25725acbe69b8c
