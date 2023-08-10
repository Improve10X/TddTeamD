package com.improve10x.tdd.supriya.shipping;

public class ShippingDemo {
    public static void main(String[] args) {
        Shipping standardShipping = new StandardShipping(90);
        standardShipping.shippingDetailsInfo();
        Shipping expressShipping = new ExpressShipping(150);
        expressShipping.shippingDetailsInfo();
    }
}
