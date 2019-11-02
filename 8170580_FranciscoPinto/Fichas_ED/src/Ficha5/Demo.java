package Ficha5;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayUnorderedList<Integer> u1 = new ArrayUnorderedList<>();
		u1.addToFront(1);
		u1.addToRear(3);
		u1.addAfter(1, 2);
		u1.addAfter(3, 4);
		u1.addToRear(5);
		u1.removeFirst();
		u1.removeLast();
		u1.addToRear(5);
		u1.addToFront(1);
		u1.remove(2);
		System.out.println("First element: " + u1.first());
		System.out.println("Last element: " + u1.last());
		System.out.println("Size: " + u1.size());
		System.out.println("List: " + u1.toString());
	}
}
