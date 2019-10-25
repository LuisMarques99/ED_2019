package Default;

import LinkedQueue.LinkedQueue;

public class DEMO {
    public static void main(String[] args) {
        QueueADT<Integer> queue = new LinkedQueue<Integer>();

        int test = 1;

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
        }
    }
}
