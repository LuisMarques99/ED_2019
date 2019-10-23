package Ficha4;

public class TesteLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueADT<Integer> queue1 = new LinkedQueue<>();
		queue1.dequeue();
		queue1.enqueue(11);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.enqueue(15);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.enqueue(23);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.enqueue(2);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
	}
}
