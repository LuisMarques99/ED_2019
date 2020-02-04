package Default;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * <h3>
 * <strong>Classe que representa a estrutura de uma ordenação de Strings pelo tamanho</strong>
 * </h3>
 */
public class SortStrings {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("bananas");
        al.add("ananas");
        al.add("salsichas");

        System.out.println(al);

        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        System.out.println(al);
    }
}
