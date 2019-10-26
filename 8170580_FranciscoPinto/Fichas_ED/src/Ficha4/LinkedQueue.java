package Ficha4;

import Ficha3.LinearNode;

public class LinkedQueue<T> implements QueueADT<T> {
	private LinearNode<T> head;
	private LinearNode<T> tail;
	private int count = 0;
	
	public LinkedQueue() {
		this.head = null;
		this.tail = null;
		count = 0;
	}
	
	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		LinearNode<T> tempNode = new LinearNode<T>(element);
		if(head == null) {
			head = tempNode;
			count++;
		}
		else if(head != null && head.getNext() == null){
			tail = tempNode;
			head.setNext(tail);
		    count++;
		}
		else {
			tail.setNext(tempNode);
			tail = tempNode;
			count++;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("Empty queue...");
		}
		if(head.getNext() == null) {
			head = null;
			count--;
		}
		else
	        head = head.getNext();
			T result = (T) head;
	        count--;
		return result;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		T result = null;
		if (head != null) {
			result = (T) head.getElement();
		}
		return result;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (count == 0)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

}
