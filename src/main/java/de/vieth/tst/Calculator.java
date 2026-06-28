package de.vieth.tst;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch null ist nicht erlaubt");
        }
        return a / b;
    }
}