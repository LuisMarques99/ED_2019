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

        int testNumber = 6;

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
                list.addToFront("string 2");
                list.addAfter("string 3", "string 2");
                list.addToRear("string 5");
                list.addAfter("string 4", "string 3");
                list.addToFront("string 1");

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;

            case 6:
                list.addToFront("string 2");
                list.addAfter("string 3", "string 2");
                list.addToRear("string 5");
                list.addAfter("string 4", "string 3");
                list.addToFront("string 1");
                list.addToFront("string 0");
                list.removeFirst();
                list.removeLast();
                list.remove("string 4");

                System.out.println(list.toString());
                System.out.println("\nFirst: " + list.first());
                System.out.println("\nLast: " + list.last());
                System.out.println("\nEmpty list: " + list.isEmpty());
                break;
        }
    }
}
