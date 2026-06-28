package de.vieth.tst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {

    @Test
    void addsItemToCart() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apfel", 2, 1.50);

        assertEquals(1, cart.getItemCount());
    } 

    @Test
void calculatesTotalPrice() {
    ShoppingCart cart = new ShoppingCart();

    cart.addItem("Apfel", 2, 1.50);
    cart.addItem("Brot", 1, 2.00);

    assertEquals(5.00, cart.getTotalPrice(), 0.001);
}
}