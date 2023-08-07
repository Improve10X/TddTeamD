package com.improve10x.tdd.krishna;

public abstract class Shipping {

    String mode;
    double price;

    public Shipping(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }

    public void showShippingDetails(){
        System.out.println("Shipping Mode : " + mode);
        System.out.println("Shipping Charges : " + calculateShippingCharges());
    }

    public abstract double calculateShippingCharges();
}
