package Default;

import java.util.ArrayList;

public class LinkedList<T> {
    ArrayList<T> items;

    public LinkedList() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        for (T i : this.items) {
            if (i == null) {
                i = item;
            }
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "items=" + items.toString();
    }
}
