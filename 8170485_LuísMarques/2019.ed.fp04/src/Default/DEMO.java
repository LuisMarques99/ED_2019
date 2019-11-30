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
        QueueADT<Integer> queue = new ArrayQueue<Integer>();

        int test = 6;

        switch (test) {
            case 1:
                queue.enqueue(1);
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
                queue.enqueue(1);

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
                queue.enqueue(1);
                queue.enqueue(2);
                queue.enqueue(3);
                queue.enqueue(4);
                queue.enqueue(5);

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());
                break;

            case 5:
                queue.enqueue(1);
                queue.enqueue(2);
                queue.enqueue(3);
                queue.enqueue(4);
                queue.enqueue(5);

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());

                System.out.println("\n\n\nDequeue 5 elements!\n\n");

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
                queue.enqueue(1);
                queue.enqueue(2);
                queue.enqueue(3);
                queue.enqueue(4);
                queue.enqueue(5);

                System.out.println(queue.toString() + "\n\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst element: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\nEmpty queue: " + queue.isEmpty());

                System.out.println("\n\n\nDequeue 3 elements!\n\n");

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
        }
    }
}
