package com.improve10x.tdd.krishna;

public class ShippingDemo {

    public static void main(String[] args) {
        Shipping standardShipping = new StandardShipping(45);
        standardShipping.showShippingDetails();
        Shipping expressShipping = new ExpressShipping("Express Shipping ", 45);
        expressShipping.showShippingDetails();
    }
}
