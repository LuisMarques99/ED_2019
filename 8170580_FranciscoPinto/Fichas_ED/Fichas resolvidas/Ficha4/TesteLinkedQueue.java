package Ficha4;

public class TesteLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueADT<Integer> queue1 = new LinkedQueue<>();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.enqueue(3);
		System.out.println("Head: " + queue1.first());
		System.out.println("Size: " + queue1.size());
	}
}
