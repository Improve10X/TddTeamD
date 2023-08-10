package com.improve10x.tdd.krishna.shipping;

public class ShippingDemo {

    public static void main(String[] args) {
        Shipping standardShipping = new StandardShipping(200);
        standardShipping.showShippingInfo();
        Shipping expressShipping = new ExpressShipping(150);
        expressShipping.showShippingInfo();
    }
}
