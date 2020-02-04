package Ficha5;

public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T>{
	
    public ArrayOrderedList() {super();}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public void add(T element) {
		// TODO Auto-generated method stub
        Comparable<T> auxFirst = null;
        Comparable<T> auxLast = null;

        if (!isEmpty()) {
            auxFirst = (Comparable<T>) first();
            auxLast = (Comparable<T>) last();

            if (last == first) {
                expandCapacity();
            }
        }

        if (isEmpty()) {
            list[0] = element;
            first = 0;
            last = 1;

        } 
        else if (auxFirst.compareTo(element) == 1) {
            for (int i = last; i > first; i--) {
                list[i] = list[i - 1];
            }

            list[first] = element;
            last = (last + 1) % list.length;

        } 
        else if (auxLast.compareTo(element) == -1) {
            list[last] = element;
            last = (last + 1) % list.length;

        } 
        else {

            for (int i = first + 1; i <= count; i = (i + 1) % list.length) {
                auxFirst = (Comparable<T>) list[i];

                if (auxFirst.compareTo(element) == 1) {

                    int temporarioPosicao = i + 1;
                    T backup = list[temporarioPosicao - 1];
                    T backup2;

                    for (int j = 0; j < count - (i - first); j++) {
                        backup2 = list[temporarioPosicao];
                        list[temporarioPosicao] = backup;
                        temporarioPosicao = (temporarioPosicao + 1) % list.length;
                        backup = backup2;
                    }
                    list[i] = element;
                    last = (last + 1) % list.length;
                    break;
                }
            }
        }
        count++;
    }
}
