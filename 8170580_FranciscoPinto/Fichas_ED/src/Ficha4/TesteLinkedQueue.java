package Ficha4;

public class TesteLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueADT<Integer> queue1 = new LinkedQueue<>();
		queue1.enqueue(1);
		System.out.println("Head: " + queue1.first());
	}
}
