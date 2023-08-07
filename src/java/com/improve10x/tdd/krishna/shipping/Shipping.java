package com.improve10x.tdd.krishna.shipping;

public abstract class Shipping {

    protected String mode;
    protected double price;

    public Shipping(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }

    public void showShippingInfo(){
        System.out.println("Shipping Mode : " + mode);
        System.out.println("Shipping Charges : " + calculateShippingCharges());
    }

    public abstract double calculateShippingCharges();
}
