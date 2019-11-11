package Default;

import Queue.ArrayQueue;
import Queue.LinkedQueue;
import Queue.QueueADT;
import Queue.EmptyCollectionException;

/**
 * <h3>
 * <strong>Class to test all the features developed</strong>
 * </h3>
 *
 * @author Luis Marques
 */
public class DEMO {
    public static void main(String[] args) {
        QueueADT<String> queue = new ArrayQueue<String>();

        int test = 1;

        switch (test) {
            case 1:
                queue.enqueue("Hello");
                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
                break;

            case 2:
                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
                break;

            case 3:
                queue.enqueue("Hello");

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());

                System.out.println("\n\n\nDequeue 1 element!\n\n");

                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
                break;

            case 4:
                queue.enqueue("H");
                queue.enqueue("E");
                queue.enqueue("L");
                queue.enqueue("L");
                queue.enqueue("O");

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
                break;

            case 5:
                queue.enqueue("H");
                queue.enqueue("E");
                queue.enqueue("L");
                queue.enqueue("L");
                queue.enqueue("O");

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());

                System.out.println("\n\n\nDequeue 5 element!\n\n");

                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
                break;

            case 6:
                queue.enqueue("H");
                queue.enqueue("E");
                queue.enqueue("L");
                queue.enqueue("L");
                queue.enqueue("O");

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());

                System.out.println("\n\n\nDequeue 3 element!\n\n");

                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
        }
    }
}
