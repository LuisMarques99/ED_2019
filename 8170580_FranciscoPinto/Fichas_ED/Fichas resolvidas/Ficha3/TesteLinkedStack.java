package Ficha3;

public class TesteLinkedStack {

	public static void main(String[] args) throws EmptyCollectionException {
		// TODO Auto-generated method stub
		//Se eu puser StackADT ao inicio significa que posso utilizar LinkedStack ou ArrayStack sem ter de modificar nada abaixo!
		StackADT<Integer> m1 = new LinkedStack<Integer>();
		//m1.pop();
		m1.push(1);
		m1.push(2);
		m1.push(3);
		m1.pop();
		m1.pop();
		m1.push(5);
		System.out.println("List empty: " + m1.isEmpty());
		System.out.println("Top element: " + m1.peek());
		System.out.println("Size: " + m1.size());
		
		System.out.println("\n==================================\n");
		
		LinkedStack<Integer> m2 = new LinkedStack<Integer>(6);
		System.out.println("List empty: " + m2.isEmpty());
		System.out.println("Top element: " + m2.peek());
		System.out.println("Size: " + m2.size());
		
		System.out.println("\n==================================\n");
		
		LinkedStackLinearNode<Integer> m3 = new LinkedStackLinearNode<>();
		m3.push(1);
		m3.push(2);
		m3.pop();

		System.out.println("List empty: " + m3.isEmpty());
		System.out.println("Top element: " + m3.peek());
		System.out.println("Size: " + m3.size());
	}
}
