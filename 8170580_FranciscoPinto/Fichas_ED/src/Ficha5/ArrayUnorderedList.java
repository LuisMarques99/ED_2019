package Ficha5;

import java.util.NoSuchElementException;

public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T>{
	
    public ArrayUnorderedList() {}

    public ArrayUnorderedList(int initialCapacity) {
        super(initialCapacity);
    }
	
	@Override
	public void addToFront(T element) {
		// TODO Auto-generated method stub
		if(last == list.length) {
			expandCapacity();
		}
		if(last > 0) {
			for(int a = last ; a >= 1 ; a--) {
				list[a] = list[a-1];
			}
		}
		last++;
		list[first] = element;
		count++;	
	}
	
	@Override
	public void addToRear(T element) {
		// TODO Auto-generated method stub
		if(last == list.length) {
			expandCapacity();
		}
		else {
			list[last] = element;
			last++;
			count++;
		}
	}

	@Override
	public void addAfter(T target, T element) {
		// TODO Auto-generated method stub
        int found = -1;

        if (last > 0) {
            for (int i = 0; i < last; i++) {
                if (list[i].equals(target)) {
                    found = i; // encontrou fica com a posicao do elemento no array
                }
            }
        }
        if (found == -1) {
            throw new NoSuchElementException("This element does not exist...");
        } 
        else {
            last++;
            for (int i = last; i >= found + 1; i--) {
                list[i] = list[i - 1];
            }
            list[found + 1] = element;
        }
        count++;
    }
}
