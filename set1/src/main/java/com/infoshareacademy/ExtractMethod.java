
package com.infoshareacademy;


import java.util.List;

public class ExtractMethod {

    //todo: sprójrz co robi metoda. Czy widzisz fragmentu kodu które się powtarzają?
    // Spróbuj skrócić metodę zwiększając jej czytelność przez refactoring "Extract method".
    // (czy IntelliJ było "inteligentne" i wykryło duplikację?)

    public String jakasKiepskaMetoda(List<String> list1, List<String> list2) {

        StringBuilder calosc = new StringBuilder();

        getList(list1, calosc, "list1=", "]; ");

        getList(list2, calosc, "list2=", "]");

        return calosc.toString();
    }

    private void getList(List<String> list1, StringBuilder calosc, String s2, String s3) {
        calosc.append(s2);
        calosc.append("[");
        for (String s : list1) {
            calosc.append(s);
            calosc.append(",");
        }
        calosc.append(s3);
    }

}
