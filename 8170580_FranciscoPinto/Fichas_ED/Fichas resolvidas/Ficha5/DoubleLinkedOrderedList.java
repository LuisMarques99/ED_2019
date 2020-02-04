package Ficha5;

public class DoubleLinkedOrderedList<T extends Comparable<T>> extends DoubleLinkedList<T> implements OrderedListADT<T> {

    public DoubleLinkedOrderedList() {
        super();
    }

    @Override
    public void add(T element) {
        if (super.isEmpty()) {
            first = new DoubleNode<T>();
            last = new DoubleNode<T>();
            first.setElement(element);
            first.setNext(last);
            last.setPrevious(first);
            cont++;
        } else if (super.first.getElement().compareTo(element) >= 0) {
            first.setPrevious(new DoubleNode<T>());
            first.getPrevious().setNext(first);
            first = first.getPrevious();
            first.setElement(element);
            cont++;
        } else if (super.last.getPrevious().getElement().compareTo(element) <= 0) {
            last.setElement(element);
            last.setNext(new DoubleNode<T>());
            last.getNext().setPrevious(last);
            last = last.getNext();
            cont++;
        } else {
            DoubleNode<T> aux = first.getNext();
            DoubleNode<T> temp = new DoubleNode<T>();
            while (aux.getElement() != null) {
                if (aux.getElement().compareTo(element) >= 0) {
                    temp.setPrevious(aux.getPrevious());
                    temp.setNext(aux);
                    temp.setElement(element);
                    aux.getPrevious().setNext(temp);
                    aux.setPrevious(temp);
                    cont++;
                    break;
                } else {
                    aux = aux.getNext();
                }
            }
        }
    }

}
