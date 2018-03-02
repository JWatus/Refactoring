
package com.infoshareacademy;


import java.util.List;

/**
 * kod klasy ExtractMethod2 jest odpowiednikiem klasy "ExtractMethod" po refaktoryzacji.
 */
public class ExtractMethod2 {

    //todo: zlikwiduj metodę "listujListe" poprzez refactoring inline

    public String jakasKiepskaMetoda(List<String> list1, List<String> list2) {
        StringBuilder calosc = new StringBuilder();

        calosc.append("list1=");
        calosc.append("[");
        for (String s1 : list1) {
            calosc.append(s1);
            calosc.append(",");
        }
        calosc.append("]; ");

        calosc.append("list2=");
        calosc.append("[");
        for (String s : list2) {
            calosc.append(s);
            calosc.append(",");
        }
        calosc.append("]");

        return calosc.toString();
    }
}
