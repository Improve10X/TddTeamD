package com.improve10x.tdd.supriya.shipping;

public abstract class Shipping {
    String mode;
    double price;
    public Shipping(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }

    public void shippingDetailsInfo(){
        System.out.println("ShippingMode:"+mode);
        System.out.println("ShippingCharges:"+calculateCharges());
    }

    public abstract double calculateCharges();

}
