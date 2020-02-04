package Ficha5;

public interface UnorderedListADT<T> extends ListADT<T>{
	
	/*
	 * Metodo responsavel por adicionar elemento á frente da lista
	 */
	public void addToFront(T element);
	
	/*
	 * Metodo responsavel por adicionar o elemento no fim da lista
	 */
	public void addToRear(T element);
	
	/*
	 * Metodo responsavel por adicionar elemento(target) na posicao a seguir de um elemento (element) especificado
	 */
	public void addAfter(T target , T element);
}
