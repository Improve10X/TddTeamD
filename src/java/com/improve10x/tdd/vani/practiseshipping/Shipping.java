package com.improve10x.tdd.vani.practiseshipping;

public abstract class Shipping {
    String mode;
    double price;

    public Shipping(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }

    public void showShippingInfo(){
        System.out.println("shipping mode : "+ mode);
        System.out.println("shipping charges : "+ calculateShippingCharges());
    }

    public abstract double calculateShippingCharges();
}
