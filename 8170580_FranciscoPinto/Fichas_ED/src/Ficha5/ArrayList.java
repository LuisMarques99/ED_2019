package Ficha5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements ListADT<T>{
	private static final int DEFAULT_CAPACITY = 10;
	protected int first = 0;
	protected int last = 0;
	protected int count = 0;
	protected T[] list;
	
	/*
	 * TRATAR DISTO COMO SE APENAS TRABALHA-SE COM ARRAYS!!!!	
	 */
	
    @SuppressWarnings("unchecked")
	public ArrayList() {
        this.list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity) {
        this.list = (T[]) new Object[initialCapacity];
    }

	@Override
	public T removeFirst() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("List is empty...");
		}
		T temp = list[first];
		list[first] = null;
		first++;
		count--;
		return temp;
	}

	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("List is empty...");
		}
        if (last == 0) {
            T temp = list[list.length - 1];
            list[list.length - 1] = null;
            last = list.length - 1;
            count--;
            return temp;
        } else {
            T temp = list[last - 1];
            list[last - 1] = null;
            last--;
            count--;
            return temp;
        }
	}

	@Override
	public T remove(T element) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("List is empty...");
			return null;
		}
		if(!contains(element)) {
			System.out.println("Element not found in array...");
			return null;
		}
		if(list[first].equals(element)) {
			removeFirst();
		}
		else if(list[last-1].equals(element)) {
			removeLast();
		}
		else {
            for (int a = first; a < last; a++) {
                if(list[a].equals(element)) {
                	list[a] = list[a + 1];
        			for(int b = a ; b < last ; b++) {
        				list[b] = list[b+1];
        			}
        			last--; //temos de diminuir o last pois foi eliminada uma posicao, logo, o last que tem diminuir de tamanho.
                }
            }
		}
		count--;
        return element;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return list[first];
	}

	@Override
	public T last() {
		// TODO Auto-generated method stub
		return list[last-1];
	}

	@Override
	public boolean contains(T target) {
		// TODO Auto-generated method stub
        if (isEmpty()) {
           System.out.println("Element does not exist in this list...");
        }
        for (int i = first; i < last; i++) {
            if (list[i].equals(target)) {
                return true;
            }
        }
        return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new BasicIterator();
	}
	
	public class BasicIterator implements Iterator<T>{
		private int basicIter = first;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return ((basicIter < list.length) && (list[basicIter] != null));
		}

		@Override
        public T next() {
            if (hasNext()) {
                return list[basicIter++];
            } else {
                throw new NoSuchElementException();
            }
		}
	}
	
    public String toString() {
        if (isEmpty()) {
            System.out.println("List is empty...");
        }
        String string = new String();
        int temp = first;
        for (int i = 0; i < count - 1; i++) {
            string += list[temp] + ", ";
            temp = (temp + 1) % list.length;
        }
        string += list[temp];
        return ("{" + string + '}');
    }
    
	public void expandCapacity() {
        @SuppressWarnings("unchecked")
		T[] newList = (T[]) (new Object[list.length + DEFAULT_CAPACITY]);
        for (int i = 0; i < list.length; i++)
        newList[i] = list[i];
        list = newList;
	}


}
