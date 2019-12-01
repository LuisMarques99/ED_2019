package Default;

import Exceptions.ElementNotComparableException;
import List.ArrayList;
import List.ArrayOrderedList;

/**
 * <h3>
 * <strong>DEMO class to test all the methods implemented</strong>
 * </h3>
 *
 * @author Luis Marques
 */
public class DEMO {
    public static void main(String[] args) {
        ArrayOrderedList<String> list = new ArrayOrderedList<String>();

        int testNumber = 1;

        switch(testNumber){
            case 1:
                try {
                    list.add("TESTE");
                } catch (ElementNotComparableException e) {
                    e.printStackTrace();
                }
                System.out.println(list.toString());
                break;
            case 2:

                break;
        }
    }
}
