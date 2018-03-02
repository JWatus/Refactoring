package com.infoshareacademy.geometry;

/**
 * Klasa reprezentujaca Okrąg.
 */
public class Circle {

    public static final double PI = 3.14159;
    public Integer r;

    private double area;
    private double circuit;

    public Circle(Integer r) {
        this.r = r;
    }

    public Float calculateArea() {
        final int promienKwadrat = r * r;
        area = PI * promienKwadrat;
        return (float)area;
    }

    public Double calculateCircuit() {
        circuit = 2 * PI * r;
        return circuit;
    }

    public double getArea() {
        return area;
    }

    public double getCircuit() {
        return circuit;
    }


    //todo A (extract)
    // uwaga - wszystkie operacje należy przeprowadzać poprzez narzędzie refaktoryzacji IJ, a nie "ręcznie".

    // 1. wyehstrahuj wyrażenie "r * r" jako osobną zmienną (w metodzie calculateArea)
    // 2. wykonaj ekstrahowanie liczby Pi do stałej (IJ powinien wykryć wszystkie użycia stałej 3.14 w całej klasie i dokonać zamian)
    // 3. wyodrębnij polePowierzchni i circuit jako pola w klasie


    //todo B (rename)
    // 0. dodaj gettery dla obwodu i polaPowierzchni (Alt + Insert)
    // 1. zmien nazwę pola "r" na "r".
    // 2. zmien nazwy metod (np. zeby byly po angielsku). (Zainicjuj jedną z tych operacji z poziomu pliku OkragTest.java,
    //   a drugą z poziomu obecnego pliku)
    // 3. zmień nazwę klasy na Circle
    // 4. zmień package na com.infoshareacademy.geometry



    // todo C (change signature)
    // 1. zmien parametr konstruktora z int na Integer (używając opcji "change signature"). Zmień też nazwę parametru na
    // "r".
    // 2a. dodaj nowe parametry do kontruktora (x i y) oznaczające środek okręgu w układzie współrzędnych. Nadaj
    //   wartości domyślne (np. x=0, y=0), tak aby IJ mógł przeprowadzić zmiany w istniejącym kodzie.
    // 2b. Zrób to samo bez podawania wartości defaultowej. Co się stanie?
    // 2c. (opcja) Zmień kolejność parametrów konstruktora (np. x, y, r).
    // 2d. (opcja) Usuń x i y jako parametry wejściowe (jak zawsze używając tylko menu refactor)
    // 3. Zmień metodę calculateArea tak, żeby zwracała Float.




    // todo D
    // 1. Stwórz interface (extract interface)
    // 2. ukryj dostęp do pola r(r). (Encapsulate Field)



    // pamiętaj - po każdej refaktoryzacji testy jednostkowe powinny nadal działać.



}
