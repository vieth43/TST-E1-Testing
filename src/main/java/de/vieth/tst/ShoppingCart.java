package de.vieth.tst;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<CartItem> items = new ArrayList<>();

    public void addItem(String name, int quantity, double price) {
        items.add(new CartItem(name, quantity, price));
    }

    public int getItemCount() {
        return items.size();
    }
}