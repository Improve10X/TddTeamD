package com.improve10x.tdd.supriya.shipping;

public abstract class Shipping {
    protected  String mode;
    protected double price;
    public Shipping(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }

    public void shippingDetailsInfo(){
        System.out.println("ShippingMode:"+mode);
        System.out.println("ShippingCharges:"+ calculateShippingCharges());
    }
    public abstract double calculateShippingCharges();

}
