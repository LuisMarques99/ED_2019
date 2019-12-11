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
        ArrayList<String> list = new ArrayUnorderedList<String>();

        int testNumber = 7;

        if (list instanceof ArrayUnorderedList) {
            ArrayUnorderedList<String> unorderedList = (ArrayUnorderedList) list;

            switch (testNumber) {
                case 1:
                    unorderedList.addToFront("TESTE");

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;

                case 2:
                    unorderedList.removeFirst();

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;

                case 3:
                    unorderedList.removeLast();

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;

                case 4:
                    unorderedList.remove("Teste");

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;

                case 5:
                    unorderedList.addToFront("string 2");
                    unorderedList.addAfter("string 3", "string 2");
                    unorderedList.addToRear("string 5");
                    unorderedList.addAfter("string 4", "string 3");
                    unorderedList.addToFront("string 1");

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;

                case 6:
                    unorderedList.addToFront("string 2");
                    unorderedList.addAfter("string 3", "string 2");
                    unorderedList.addToRear("string 5");
                    unorderedList.addAfter("string 4", "string 3");
                    unorderedList.addToFront("string 1");
                    unorderedList.addToFront("string 0");
                    unorderedList.removeFirst();
                    unorderedList.removeLast();
                    unorderedList.remove("string 4");

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;

                case 7:
                    unorderedList.addToFront("string 2");
                    unorderedList.addAfter("string 3", "string 2");
                    unorderedList.addToRear("string 5");
                    unorderedList.addAfter("string 4", "string 3");
                    unorderedList.addToFront("string 1");
                    unorderedList.addToFront("string 0");
                    unorderedList.removeFirst();
                    unorderedList.removeLast();
                    unorderedList.remove("string 4");
                    unorderedList.iterator();

                    System.out.println(unorderedList.toString());
                    System.out.println("\nFirst: " + unorderedList.first());
                    System.out.println("\nLast: " + unorderedList.last());
                    System.out.println("\nEmpty list: " + unorderedList.isEmpty());
                    break;
            }
        }
    }
}
