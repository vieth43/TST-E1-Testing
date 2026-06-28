package de.vieth.tst;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<String> items = new ArrayList<>();

    public void addItem(String name, int quantity, double price) {
        items.add(name);
    }

    public int getItemCount() {
        return items.size();
    }
}