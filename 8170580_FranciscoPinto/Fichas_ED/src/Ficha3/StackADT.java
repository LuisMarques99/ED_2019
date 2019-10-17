package Ficha3;

public interface StackADT<T> {
	/*
	 * Adicionar um elemento no top da stack
	 */
	public void push(T element);
	
	/*
	 * Eliminar um elemento do top da stack
	 * Nao recebe elemento como parametro porque elimina sempre o top da stack!
	 */
	public T pop() throws EmptyCollectionException;
	
	/*
	 * Ver o primeiro elemento da stack
	 * Nao recebe elemento como parametro porque só se pode ver sempre o top da stack.
	 */
	public T peek() throws EmptyCollectionException;
	
	/*
	 * Funcao que tem por objetivo determinar se a stack se encontra vazia ou nao
	 * Retorna TRUE se vazia e FALSE se nao vazia
	 */
	public boolean isEmpty();
	
	/*
	 * Funcao de retorno do tamanho da stack
	 * Retorna o numero de elementos que se encontram dentro da stack
	 */
	public int size();
	
	/*
	 * Retorna uma representacao em string dos elementos da stack.
	 * Atencao! Esta funcao apenas serve de teste porque nao é suposto incluir isto em projetos oficiais.
	 * É necessário fazer o @override porque é uma funcao toString() especifica para as aulas e nao é a funcao normal de Java
	 */
	@Override
	public String toString();
	
}
