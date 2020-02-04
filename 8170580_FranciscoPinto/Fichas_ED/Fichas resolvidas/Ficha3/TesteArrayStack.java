package Ficha3;

public class TesteArrayStack {

	public static void main(String[] args) throws EmptyCollectionException {
		// TODO Auto-generated method stub
		//Se eu puser StackADT ao inicio significa que posso utilizar LinkedStack ou ArrayStack sem ter de modificar nada abaixo!
		StackADT<Integer> t1 = new ArrayStack<Integer>();
		t1.push(1);
		t1.push(2);
		t1.push(4);
		t1.push(1);
		t1.pop();
		System.out.println("Is the stack empty? " + t1.isEmpty());
		System.out.println("Element  in top of the stack: "+t1.peek());
		System.out.println("Stack size: " + t1.size());
	}

}
