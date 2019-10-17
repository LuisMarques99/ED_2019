package Ficha3;

public class LinkedList<T> {
	/*
	 * A linked stack é uma lista ligada de elementos, sendo que um elemento aponta para o proximo usando um node e assim sucessivamente
	 * Logo é facil de perceber que uma linked stack trabalha com nodes.
	 */
	private LinkedList<T> next; //Apontador para o proximo elemento da lista ligada. Atancao! Isto nao aponta literalmente para o proximo elemento, mas sim toma posicao 
								 //do elemento que foi adicionado em ultimo. (Ver a funcao setNext() para compreender melhor.)
	private T element; //Elemento que se encontra no nó onde estamos.
	
	/*
	 * Construtor de uma LinkedStack
	 */
	public LinkedList() {
		next = null; //Nao existe next inicialmente porque a lista está vazia
		element=  null; //Nem existe element porque pela mesma causa da lista inicialmente se encontrar vazia.
	}
	
	/*
	 * Construtor de uma linked list com um elemento inicial colocado
	 */
	public LinkedList(T element) {
		next = null; //Nao existe next porque apenas existe um elemento.
		this.element = element;
	}
	
	/*
	 * Funcao que retorna o proximo node na lista ligada
	 */
	public LinkedList<T> getNext(){
		return next; 
	}
	
	/*
	 * Elemento que define qual o proximo elemento da lista irá ser
	 * Basicamente é a funcao de adicionar nodes.
	 */
	public void setNext(LinkedList<T> node) {
		next = node; //Aqui o apontador next toma o valor do novo elemento.
	}
	
	/*
	 * Funcao que retorna o valor do elemento em que nos encontramos.
	 */
	public T getElement() {
		return element;
	}
	
	/*
	 * Funcao para adicionar um elemento novo á lista
	 */
	public void setElement(T element) {
		this.element = element;
	}
	
	/*
	 * Nota:
	 * Nao confundir os nodes com os elementos.
	 * Ao adicionar um novo node com setNext() nao significa que estamos a adicionar um elemento, mas sim apenas mais um node! 
	 * Para adicionar um valor ao node temos de adicionar um elemento com setElement()! 
	 */
}
