package Ficha5;
import java.util.Iterator;

public interface ListADT<T> extends Iterable<T>{
	
	/*
	 * Metodo responsavel por remover o primeiro elemento da lista
	 */
	public T removeFirst();
	
	/*
	 * Metodo responsavel por remover o ultimo elemento da lista
	 */
	public T removeLast();
	
	/*
	 * Metodo responsavel por remover um elemento especifico
	 */
	public T remove(T element);
	
	/*
	 * Metodo responsavel por retornar a referencia para o primeiro elemento
	 */
	public T first();
	
	/*
	 * Metodo responsavel por retornar a referencia para o ultimo elemento
	 */
	public T last();
	
	/*
	 * Metodo responsavel por retornar true se o elemento especificado existir na lista
	 */
	public boolean contains(T target);
	
	/*
	 * Metodo responsavel por determinar se a lista se encontra vazia
	 */
	public boolean isEmpty();
	
	/*
	 * Metodo responsavel por retornar o tamanho da lista
	 */
	public int size();
	
	/*
	 * Metodo responsavel que retorna um ITERATOR para os elementos da lista
	 */
	public Iterator<T> iterator();
	
	/*
	 * Metodo responsavel por retornar uma string com o/os elementos
	 */
	@Override
	public String toString();
}
