package de.vieth.tst;

public class CheckoutService {

    private final ShippingCostClient shippingCostClient;

    public CheckoutService(ShippingCostClient shippingCostClient) {
        this.shippingCostClient = shippingCostClient;
    }

    public double calculateFinalPrice(ShoppingCart cart) {
        double cartValue = cart.getTotalPrice();
        double shippingCost = shippingCostClient.getShippingCost(cartValue);

        return cartValue + shippingCost;
    }
}