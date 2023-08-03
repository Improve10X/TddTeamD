package com.improve10x.tdd.vani.practiseshipping;

public class ShippingDemo {
    public static void main(String[] args) {
        Shipping standardShipping = new StandardShipping(200);
        standardShipping.showShippingInfo();
        Shipping standardShipping1 = new StandardShipping(300);
        standardShipping1.showShippingInfo();
        Shipping standardShipping2 = new StandardShipping(50);
        standardShipping2.showShippingInfo();
        Shipping expressShipping = new ExpressShipping(150);
        expressShipping.showShippingInfo();
        Shipping expressShipping1 = new ExpressShipping(200);
        expressShipping1.showShippingInfo();
        Shipping expressShipping2 = new ExpressShipping(45);
        expressShipping2.showShippingInfo();
    }

}
