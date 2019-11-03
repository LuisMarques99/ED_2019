package Ficha5;

public class DoubleLinkedUnorderedList<T extends Comparable<T>> extends DoubleLinkedList<T> implements UnorderedListADT<T> {

    public DoubleLinkedUnorderedList() {
        super();
    }

    @Override
    public void addToFront(T element) {
        if (isEmpty()) {
            first = new DoubleNode<T>();
            last = new DoubleNode<T>();
            first.setElement(element);
            first.setNext(last);
            last.setPrevious(first);
            cont++;
        } else {
            first.setPrevious(new DoubleNode<T>());
            first.getPrevious().setNext(first);
            first = first.getPrevious();
            first.setElement(element);
            cont++;
        }
    }

    @Override
    public void addToRear(T element) {
        if(isEmpty()){
            first = new DoubleNode<T>();
            last = new DoubleNode<T>();
            first.setElement(element);
            first.setNext(last);
            last.setPrevious(first);
            cont++;
        }else{
            last.setElement(element);
            last.setNext(new DoubleNode<T>());
            last.getNext().setPrevious(last);
            last = last.getNext();
            cont++;
        }
    }

    @Override
    public void addAfter(T element, T target) {
        DoubleNode<T> aux = first;
        DoubleNode<T> temp = new DoubleNode<T>();
        while(aux.getNext()!=null){
            if(aux.getElement().equals(target)){
                temp.setPrevious(aux);
                temp.setNext(aux.getNext());
                temp.setElement(element);
                aux.getNext().setPrevious(temp);
                aux.setNext(temp);
                cont++;
                break;
            }else
                aux = aux.getNext();
        }
    }
}
