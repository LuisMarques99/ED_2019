package Default;

import LinkedQueue.LinkedQueue;

public class DEMO {
    public static void main(String[] args) {
        QueueADT<Integer> queue = new LinkedQueue<Integer>();

        int test = 2;

        switch (test) {
            case 1:
                queue.enqueue(1);
                queue.enqueue(2);
                System.out.println(queue.toString() + "\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                break;
            case 2:
                queue.enqueue(1);
                queue.enqueue(2);
                System.out.println(queue.toString() + "\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                try {
                    queue.dequeue();
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }

                System.out.println("\n\n######################################################\n\n");

                System.out.println(queue.toString() + "\nSize: " + queue.size());
                try {
                    System.out.println("\nFirst: " + queue.first());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                break;
        }
    }
}
