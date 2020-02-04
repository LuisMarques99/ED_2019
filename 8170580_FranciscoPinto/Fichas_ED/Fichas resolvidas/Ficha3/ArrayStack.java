package Ficha3;

public class ArrayStack<T> implements StackADT<T> {
	private final int DEFAULT_CAPACITY = 100; //Definir o tamanho default do array. Pode ser qualquer valor.
	private int top; //Representacao do top da stack. Este numero nao s� determina o numero de elementos que est� na stack mas tambem a proxima posicao a ser ocupada!
	private T[] stack; //Isto � o array de elementos genericos. Podia chamar-se de array. Tanto vale!
	
	/*
	 * Criacao do construtor do nossa Array que implementa Stack.
	 * Top inicializado a zero porque nao contem elementos inicialmente.
	 * A nossa stack ("Array") � inicializada com um tamanho DEFAULT_CAPACITY.
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		top = 0;
		stack = (T[])(new Object[DEFAULT_CAPACITY]);
	}
	
	/*
	 * Por outro lado tambem podemos criar um construtor com um tamanho pr�-definido pelo utilizador
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		top = 0;
		stack = (T[])(new Object[size]);
	}
	
	/*
	 * Metodo responsavel por expandir o tamanho do ArrayStack caso este se encontre cheio!
	 */
	public void expandCapacity() {
        @SuppressWarnings("unchecked")
		T[] newStack = (T[]) (new Object[stack.length + DEFAULT_CAPACITY]);
        for (int i = 0; i < stack.length; i++)
        newStack[i] = stack[i];
        stack = newStack;
	}
	

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		if (size() == stack.length) { //Caso o tamanho da stack seja igual ao seu length aumenta a sua capacidade
			expandCapacity(); 
		}
		stack[top] = element; //Caso contr�rio a stack na posicao top vai ser o novo elemento
		top++; //e aumenta-se o index de top!
	}

	@Override
	public T pop() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyCollectionException("Stack is empty!"); //Se a stack estiver vazia entao retorna a mensagem de erro dentro de aspas.
		top--; //caso contr�rio o index do top � diminuido para ir para o elemento que est� no topo da stack (porque top nao aponta para o primeiro elemento mas sim para a
			   //posicao diretamente acima do primeiro elemento!!!!)
		T result = stack[top]; //o elemento de resultado toma o valor do primeiro elemento da stack
		stack[top] = null; //O primeiro elemento da stack � eliminado
		return result; //O resultado � mostrado.
	}

	@Override
	public T peek() throws EmptyCollectionException{
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new EmptyCollectionException("Stack is empty!");
		
		return stack[top -1]; //Caso a stack nao esteja vazia entao retorna o primeiro elemento da stack que � top - 1 porque top nao � o primeiro elemento! Mas sim a posicao
		//diretamente acima do primeiro elemento!
	}

	@Override
	public boolean isEmpty() {
		if (stack[0] == null)
			return true;
		else
			return false;
	}

	@Override
	public int size() {
		return top;
	}	
}
