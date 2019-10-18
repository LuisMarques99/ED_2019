package Ficha3;

public class LinkedStack<T> implements StackADT<T> {
	Node top;
	private int count = 0;

	private class Node{
		T data;
		Node link;
	}
	
	/*
	 * Construtor de LinkedStack
	 */
	public LinkedStack() {
		top = null;
	}
	
	/*
	 * Construtor de LinkedStack com elemento inicial
	 */
	public LinkedStack(T element) {
		push(element);
	}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		Node temp = new Node(); //Criar novo node
		temp.data = element; //Valor do novo node tem o valor do elemento
		temp.link = top;
		top = temp;
		count++;
	}

	@Override
	public T pop() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		if (top == null)
			throw new EmptyCollectionException("Empty list!");
		top = (top).link;
		T result = (T) top;
		count--;
		return result;
	}

	@Override
	public T peek() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		T result = top.data;
		return result;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
}	
