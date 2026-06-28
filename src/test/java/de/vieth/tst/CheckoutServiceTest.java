package de.vieth.tst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CheckoutServiceTest {

    @Test
    void calculatesFinalPriceWithMockedShippingCost() {
        ShippingCostClient shippingCostClient = mock(ShippingCostClient.class);
        ShoppingCart cart = new ShoppingCart();
        CheckoutService checkoutService = new CheckoutService(shippingCostClient);

        cart.addItem("Apfel", 2, 1.50);
        when(shippingCostClient.getShippingCost(3.00)).thenReturn(4.99);

        double result = checkoutService.calculateFinalPrice(cart);

        assertEquals(7.99, result, 0.001);
        verify(shippingCostClient).getShippingCost(3.00);
    }
}