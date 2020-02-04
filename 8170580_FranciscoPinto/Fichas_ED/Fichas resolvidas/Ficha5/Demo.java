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
		u1.addToFront(6);
		u1.addToRear(7);
		System.out.println("Unordered list:");
		System.out.println("First element: " + u1.first());
		System.out.println("Last element: " + u1.last());
		System.out.println("Size: " + u1.size());
		System.out.println("List: " + u1.toString());
		
		System.out.println("\n");
		
		ArrayOrderedList<Integer> u2 = new ArrayOrderedList<>();
		u2.add(1);
		u2.add(3);
		u2.add(2);
		u2.removeFirst();
		u2.add(5);
		u2.add(4);
		u2.removeLast();
		u2.add(1);
		u2.add(7);
		u2.remove(3);
		System.out.println("Ordered list:");
		System.out.println("First element: " + u2.first());
		System.out.println("Last element: " + u2.last());
		System.out.println("Size: " + u2.size());
		System.out.println("List: " + u2.toString());
		
		System.out.println("\n");
		
		DoubleLinkedOrderedList<Integer> d1 = new DoubleLinkedOrderedList<>();
		d1.add(1);
		d1.add(2);
		d1.add(3);
		d1.removeFirst();
		d1.add(1);
		d1.removeLast();
		d1.add(3);
		d1.add(4);
		d1.remove(2);
		System.out.println("DoubleLinkedOrderedList:");
		System.out.println("First element: " + d1.first());
		System.out.println("Last element: " + d1.last());
		System.out.println("Size: " + d1.size());
		System.out.println("List: " + d1.toString());
		
		System.out.println("\n");
		
		DoubleLinkedUnorderedList<Integer> d2 = new DoubleLinkedUnorderedList<>();
		d2.addToFront(1);
		d2.addToRear(2);
		d2.addToFront(3);
		d2.removeFirst();
		d2.addToRear(3);
		d2.addToFront(4);
		d2.removeLast();
		d2.addToFront(5);
		d2.remove(4);
		System.out.println("DoubleLinkedUnorderedList:");
		System.out.println("First element: " + d2.first());
		System.out.println("Last element: " + d2.last());
		System.out.println("Size: " + d2.size());
		System.out.println("List: " + d2.toString());
	}
}
