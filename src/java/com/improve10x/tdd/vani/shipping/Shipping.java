package com.improve10x.tdd.vani.shipping;

public abstract class Shipping {
    protected String mode;
    protected double price;

    public Shipping(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }

    public void showShippingInfo(){
        System.out.println("Shipping mode : " + mode);
        System.out.println("Shipping charges : " + calculateShippingCharges());
    }

    public double calculateShippingCharges() {
        return 0;
    }

}
