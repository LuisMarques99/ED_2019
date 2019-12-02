package Default;

import Exceptions.ElementNotComparableException;
import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import List.ArrayList;
import List.ArrayOrderedList;
import List.ArrayUnorderedList;

/**
 * <h3>
 * <strong>DEMO class to test all the methods implemented</strong>
 * </h3>
 *
 * @author Luis Marques
 */
public class DEMO {
    public static void main(String[] args) throws EmptyCollectionException, ElementNotFoundException {
        ArrayUnorderedList<String> list = new ArrayUnorderedList<String>();

        int testNumber = 5;

        switch (testNumber) {
            case 1:
                list.addToFront("TESTE");

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;

            case 2:
                list.removeFirst();

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;

            case 3:
                list.removeLast();

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;

            case 4:
                list.remove("Teste");

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;

            case 5:
                list.addToFront("string 1");
                list.addAfter("string 2", "string 1");

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;
        }
    }
}
