package Ficha4;

public class LinkedQueue<T> implements QueueADT<T>{
	private T next;
	private T head;
	private T tail;
	private int count;
	
	/*
	 * Metodo construtor de LinkedQueue sem parametros iniciais introduzidos
	 */
	public LinkedQueue() {
		this.head = null;
		this.tail = null; 
		count = 0;
	}

	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		if(head == null) {
			tail = element;
			head = element;
			count++;
		}
		else {
			next = element;
			tail = next;
			count++;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("A queue está vazia!");
		}
		else if(size() == 1){
			tail = null;
			head = null;
			count--;
		}
		else if(size() == 2) {
			head = tail;
			count--;
		}
		else {
			head = null; //Nao sei como é suposto fazer com que head avance para o proximo elemento!!!!!!
			count--;
		}
		return head;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return head;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (tail == null)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
}
