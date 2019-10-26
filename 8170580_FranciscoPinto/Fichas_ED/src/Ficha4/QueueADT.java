package Ficha4;

import Ficha3.EmptyCollectionException;

public interface QueueADT<T> {
	/*
	 * Adicionar elemento na cauda da queue
	 */
	public void enqueue(T element);
	
	/*
	 * Remover elemento á cabeça da queue
	 */
	public T dequeue();
	
	/*
	 * Metodo de retorno do elemento á cabeça da queue sem o eliminar/retirar
	 */
	public T first();
	
	/*
	 * Metodo de retorno se a queue se encontra cheia ou vazia
	 */
	public boolean isEmpty();
	
	/*
	 * Metodo de retorno do numero de elementos da queue
	 */
	public int size();
	
	/*
	 * Metodo adicional que nao é suposto ser implementado verdadeiramente
	 * Metodo que retorna em modo string os elementos de uma queue
	 */
	public String toString();
}
