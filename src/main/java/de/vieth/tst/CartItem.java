package de.vieth.tst;

public class CartItem {

    private final String name;
    private final int quantity;
    private final double price;

    public CartItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}