package Ficha3;

public class TesteLinkedStack {

	public static void main(String[] args) throws EmptyCollectionException {
		// TODO Auto-generated method stub
		LinkedStack<Integer> m1 = new LinkedStack<Integer>();
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
	}
}
