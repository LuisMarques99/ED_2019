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
		
		if(head == null) {
			head.setElement(element);
			tail.setElement(element);
			count++;
		}
		else if(head != null && head.getNext() == null){
			tail.setElement(element);
			head.setNext(tail);
		    count++;
		}
		else {
			LinearNode<T> temp = new LinearNode<T>(element);
			tail.setNext(temp);
			tail = temp;
			count++;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(head == null) 
			System.out.println("Empty queue...");
		else
	        head = head.getNext();
			T result = (T) head.getElement();
	        count--;
		return result;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		T result = (T) head.getElement();
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
