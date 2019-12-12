package Ficha4;

public class CircularArrayQueue<T> implements QueueADT<T>{
	private T[] circularArray;
	private int count , head , tail;
	private static final int DEFAULT_CAPACITY = 10;
	
	/*
	 * Metodo responsavel por expandir o tamanho do ArrayStack caso este se encontre cheio!
	 */
	public void expandCapacity() {
        @SuppressWarnings("unchecked")
		T[] newStack = (T[]) (new Object[circularArray.length + DEFAULT_CAPACITY]);
        for (int i = 0; i < circularArray.length; i++)
        newStack[i] = circularArray[i];
        circularArray = newStack;
	}
	
	/*
	 * Metodo construtor de um CircularArrayQueue com DEFAULT_CAPACITY inicializada
	 */
	@SuppressWarnings("unchecked")
	public CircularArrayQueue() {
		circularArray = (T[])(new Object[DEFAULT_CAPACITY]);
		head = 0;
		tail = 0;
		count = 0;
	}
	
	/*
	 * Metodo construtor de CircularArrayQueue com tamanho definido pelo utilizador
	 */
	@SuppressWarnings("unchecked")
	public CircularArrayQueue(int size) {
		circularArray = (T[])(new Object[size]);
		head = 0;
		tail = 0;
		count = 0;
	}
	
	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		if(circularArray[head] == null) { //Aqui temos de ver de a head está vazia porque se caso esteja significa que nao existe elementos no array.
			circularArray[tail] = element; 
			circularArray[head] = element; //Aqui o head vai pertencer ao primeiro elemento que foi introduzido
			tail = (tail + 1) % circularArray.length; //A tail vai ser alterada para a proxima posicao livre no array e ter a certeza que dá a volta caso esteja no limite e o array nao esteja cheio!
			count++;
		}
		else {
			circularArray[tail] = element;
			tail = (tail + 1) % circularArray.length;
			count++;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(circularArray[head] == null) {
			System.out.println("Array circular vazio!");
		}
		else if(count == 1) {
			circularArray[head] = null;
			circularArray[tail] = null;
			count--;
		}
		else {
			circularArray[head] = null;
			head = (head + 1) % circularArray.length; //É necessário que o head seja capaz de dar a volta ao array para caso de estar no limite e ainda houver elementos existentes no inicio do array!
			count--;
		}
		return null;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return circularArray[head];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (circularArray[head] == null)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

}
