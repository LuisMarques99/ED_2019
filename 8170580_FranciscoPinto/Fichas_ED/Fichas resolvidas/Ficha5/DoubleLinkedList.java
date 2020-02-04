package Ficha5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {

    protected DoubleNode<T> first;
    protected DoubleNode<T> last;
    protected int cont;

    public DoubleLinkedList() {}

    public DoubleLinkedList(DoubleNode<T> no) {
        first = no;
        last = no;
        cont++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty...");
        }
        T temp = first.getElement();
        if (size() == 1)
            first = last = null;
        else {
            first = first.getNext();
            first.setPrevious(null);
        }
        cont--;
        return temp;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty...");
        }
        T temp = last.getElement();
        if (size() == 1)
            first = last = null;
        else {
            last = last.getPrevious();
            last.setNext(null);
        }
        cont--;
        return temp;
    }

    /**
     * Removes the first instance of the specified element from this
     * list and returns a reference to it.
     * Throws an EmptyListException
     * if the list is empty. Throws a NoSuchElementException if the
     * specified element is not found in the list.
     */
    public T remove(T targetElement) {
        if (isEmpty())
            System.out.println("List is empty...");
        boolean found = false;
        DoubleNode<T> previous = null;
        DoubleNode<T> current = first;
        while (current != null && !found)
            if (targetElement.equals(current.getElement()))
                found = true;
            else {
                previous = current;
                current = current.getNext();
            }
        if (!found)
            throw new NoSuchElementException("DoubleLinkedList");
        if (size() == 1)
            first = last = null;
        else if (current.equals(first))
            first = current.getNext();
        else if (current.equals(last)) {
            last = previous;
            last.setNext(null);
        } else
            previous.setNext(current.getNext());
        cont--;
        return current.getElement();
    }

    @Override
    public T first() {
        if (isEmpty()) {
            System.out.println("List is empty...");
        }
        return first.getElement();
    }

    @Override
    public T last() {
    	if (isEmpty()) {
            System.out.println("List is empty...");
        }
        return last.getPrevious().getElement(); //Tem de se ir buscar o elemento anterior ao node last porque o last é sempre a proxima posicao null livre da lista.
    }

    @Override
    public boolean contains(T target) {
        if (isEmpty()) {
        	System.out.println("List is empty...");
        }
        boolean found = false;
        DoubleNode<T> current = first;
        while (current != null && !found) {
            if (target.equals(current.getElement()))
                found = true;
            else {
                current = current.getNext();
            }
        }
        return found;
    }

    @Override
    public boolean isEmpty() {
        return cont == 0;
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public Iterator<T> iterator() {
        return new BasicIterator();
    }

    private class BasicIterator implements Iterator<T> {

        private DoubleNode<T> basicIterator = first;

        @Override
        public boolean hasNext() {
            return basicIterator.getNext() != null;
        }

        @Override
        public T next() {
            T element = (T) basicIterator.getElement();
            basicIterator = basicIterator.getNext();
            return element;
        }
    }

    @Override
    public String toString() {
        String string = "";
        DoubleNode<T> temp = first;

        while (temp.getNext() != null) {
            string += (temp.getElement() + " ");
            temp = temp.getNext();
        }
        return string;
    }
}
